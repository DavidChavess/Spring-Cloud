package com.delivery.deliveryapi.controller;

import com.delivery.deliveryapi.dto.DeliveryDTO;
import com.delivery.deliveryapi.dto.VoucherDTO;
import com.delivery.deliveryapi.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
	
	@Autowired
	private final DeliveryService deliveryService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public VoucherDTO reserve(@RequestBody DeliveryDTO deliveryDTO) {
		return deliveryService.reserve(deliveryDTO);
	}
}
