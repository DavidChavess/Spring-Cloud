package com.davidchaves.store.service.impl;

import com.davidchaves.store.client.SupplierClient;
import com.davidchaves.store.dto.OrderDTO;
import com.davidchaves.store.dto.SupplierDTO;
import com.davidchaves.store.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final SupplierClient supplierClient;

    private final DiscoveryClient discoveryClient;

    @Override
    public void create(OrderDTO orderDTO) {
        supplierClient.create(orderDTO);
        getInstancesInfo();
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