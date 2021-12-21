package com.delivery.deliveryapi.controller;

import com.delivery.deliveryapi.dto.DeliveryDTO;
import com.delivery.deliveryapi.dto.VoucherDTO;
import com.delivery.deliveryapi.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
	
	@Autowired
	private final DeliveryService deliveryService;

	@RequestMapping(method = RequestMethod.POST)
	public VoucherDTO reserve(@RequestBody DeliveryDTO deliveryDTO) {
		return deliveryService.reserve(deliveryDTO);
	}
}
