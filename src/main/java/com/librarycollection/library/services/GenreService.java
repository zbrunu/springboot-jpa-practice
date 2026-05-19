package com.librarycollection.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarycollection.library.entities.Genre;
import com.librarycollection.library.entities.OrderItem;
import com.librarycollection.library.repositories.GenreRepository;

@Service
public class GenreService {

	@Autowired
	private GenreRepository repository;

	public List<Genre> findAll() {
		return repository.findAll();
	}

	public Genre findById(Long id) {
		Optional<Genre> obj = repository.findById(id);
		return obj.get();
	}

	public Genre insert(Genre obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}
