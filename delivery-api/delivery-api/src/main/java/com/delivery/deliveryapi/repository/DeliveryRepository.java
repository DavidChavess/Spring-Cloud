package com.delivery.deliveryapi.repository;

import com.delivery.deliveryapi.model.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Long>{

}
