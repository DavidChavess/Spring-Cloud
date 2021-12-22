package com.davidchaves.store.client;

import com.davidchaves.store.dto.DeliveryDTO;
import com.davidchaves.store.dto.VoucherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("delivery")
public interface DeliveryClient {

    @PostMapping("/deliveries")
    VoucherDTO reserve(@RequestBody DeliveryDTO deliveryDTO);
}
