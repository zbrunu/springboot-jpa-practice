package com.librarycollection.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarycollection.library.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
