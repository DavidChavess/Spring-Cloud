package com.davidchaves.store.dto;

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
	private String number;
	private LocalDate deliveryForecast;

	@Override
	public String toString() {
		return "{" +
					"number=" + number +
					", deliveryForecast=" + deliveryForecast +
				'}';
	}
}
