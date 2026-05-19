package com.librarycollection.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarycollection.library.entities.Author;
import com.librarycollection.library.repositories.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository repository;

	public List<Author> findAll() {
		return repository.findAll();
	}

	public Author findById(Long id) {
		Optional<Author> obj = repository.findById(id);
		return obj.get();
	}

	public Author insert(Author obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}
