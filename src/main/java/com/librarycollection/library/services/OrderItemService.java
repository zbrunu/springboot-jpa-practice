package com.librarycollection.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarycollection.library.entities.Order;
import com.librarycollection.library.entities.OrderItem;
import com.librarycollection.library.repositories.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository repository;

	public List<OrderItem> findAll() {
		return repository.findAll();
	}

	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}

	public OrderItem insert(OrderItem obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}
