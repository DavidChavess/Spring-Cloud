package com.davidchaves.store.service.impl;

import com.davidchaves.store.client.DeliveryClient;
import com.davidchaves.store.client.SupplierClient;
import com.davidchaves.store.controller.response.PurchaseResponse;
import com.davidchaves.store.dto.*;
import com.davidchaves.store.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final SupplierClient supplierClient;
    private final DeliveryClient deliveryClient;

    private final DiscoveryClient discoveryClient;

    @Override
    public PurchaseResponse create(OrderDTO orderDTO) {
        var supplier = supplierClient.getByState(orderDTO.getAddress().getState());
        orderDTO.setSupplierUiid(supplier.getUiid());

        var order = supplierClient.create(orderDTO);

        DeliveryDTO deliveryDTO = DeliveryDTO.builder()
                .orderUiid(order.getUiid())
                .originAddress(supplier.getAddress())
                .destinationAddress(orderDTO.getAddress().toString())
                .dateForDelivery(LocalDate.now().plusDays(order.getPreparationTime()))
                .build();
        VoucherDTO voucher = deliveryClient.reserve(deliveryDTO);

        //getInstancesInfo();

        return PurchaseResponse.builder()
                .orderUiid(order.getUiid())
                .voucher(voucher.getNumber())
                .dateForDelivery(voucher.getDeliveryForecast())
                .preparationTime(order.getPreparationTime())
                .addressDelivery(orderDTO.getAddress().toString())
                .build();
    }

    @Override
    public SupplierDTO getByState(String state) {
        return supplierClient.getByState(state);
    }

    private void getInstancesInfo() {
        discoveryClient.getInstances("supplier")
        .forEach(instance -> {
            System.out.println("-------");
            System.out.println(instance.getInstanceId());
            System.out.println(instance.getInstanceId());
            System.out.println(instance.getHost());
            System.out.println(instance.getServiceId());
            System.out.println(instance.getPort());
            System.out.println(instance.getScheme());
            System.out.println(instance.getUri());
            System.out.println("-------");
        });
    }
}