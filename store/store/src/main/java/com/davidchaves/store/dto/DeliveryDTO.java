package com.davidchaves.store.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DeliveryDTO {
	private String orderUiid;
	private LocalDate dateForDelivery;
	private String originAddress;
	private String destinationAddress;

	@Override
	public String toString() {
		return "{" +
					"orderId=" + orderUiid +
					", dateForDelivery=" + dateForDelivery +
					", originAddress='" + originAddress + '\'' +
					", destinationAddress='" + destinationAddress + '\'' +
				'}';
	}
}
