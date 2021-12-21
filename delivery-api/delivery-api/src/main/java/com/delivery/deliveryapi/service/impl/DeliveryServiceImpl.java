package com.delivery.deliveryapi.service.impl;

import com.delivery.deliveryapi.dto.DeliveryDTO;
import com.delivery.deliveryapi.dto.VoucherDTO;
import com.delivery.deliveryapi.model.Delivery;
import com.delivery.deliveryapi.repository.DeliveryRepository;
import com.delivery.deliveryapi.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeliveryServiceImpl implements DeliveryService {
	
	private final DeliveryRepository repository;
	private final ModelMapper mapper;

	@Override
	public VoucherDTO reserve(DeliveryDTO deliveryDTO) {
		Delivery delivery = mapper.map(deliveryDTO, Delivery.class);
		delivery.setDeliveryForecast(deliveryDTO.getDateForDelivery().plusDays(1L));
		delivery = repository.save(delivery);
		return new VoucherDTO(delivery.getId(), delivery.getDeliveryForecast());
	}

}
