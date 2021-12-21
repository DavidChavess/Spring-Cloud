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
public class VoucherDTO {
	private Long number;
	private LocalDate deliveryForecast;

	@Override
	public String toString() {
		return "{" +
					"number=" + number +
					", deliveryForecast=" + deliveryForecast +
				'}';
	}
}
