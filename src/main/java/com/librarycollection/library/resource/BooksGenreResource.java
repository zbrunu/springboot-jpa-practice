package com.librarycollection.library.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.librarycollection.library.entities.BooksGenre;
import com.librarycollection.library.services.BooksGenreService;

@RestController
@RequestMapping(value = "/booksGenres")
public class BooksGenreResource {

	@Autowired
	private BooksGenreService service;

	@GetMapping
	public ResponseEntity<List<BooksGenre>> findAll() {
		List<BooksGenre> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<BooksGenre> findById(@PathVariable Long id) {
		BooksGenre obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
