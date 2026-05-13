package com.librarycollection.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarycollection.library.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
