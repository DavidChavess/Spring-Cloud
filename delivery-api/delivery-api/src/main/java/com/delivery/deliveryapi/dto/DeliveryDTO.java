package com.delivery.deliveryapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryDTO {
	private Long orderId;
	private LocalDate dateForDelivery;
	private String originAddress;
	private String destinationAddress;

	@Override
	public String toString() {
		return "{" +
					"orderId=" + orderId +
					", dateForDelivery=" + dateForDelivery +
					", originAddress='" + originAddress + '\'' +
					", destinationAddress='" + destinationAddress + '\'' +
				'}';
	}
}
