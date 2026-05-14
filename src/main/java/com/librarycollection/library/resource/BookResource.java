package com.librarycollection.library.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librarycollection.library.entities.Book;
import com.librarycollection.library.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookResource {

	private BookService services;
	
	@GetMapping
	public ResponseEntity<List<Book>> findAll(){
		List<Book> list = services.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Book> findById(@PathVariable Long id) {
		Book obj = services.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
