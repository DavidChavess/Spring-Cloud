package com.delivery.deliveryapi.service;

import com.delivery.deliveryapi.dto.DeliveryDTO;
import com.delivery.deliveryapi.dto.VoucherDTO;

public interface DeliveryService {
    VoucherDTO reserve(DeliveryDTO deliveryDTO);
}
