package com.librarycollection.library.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarycollection.library.entities.BooksGenre;
import com.librarycollection.library.repositories.BooksGenreRepository;

@Service
public class BooksGenreService {

	@Autowired
	private BooksGenreRepository repository;
	
	public List<BooksGenre> findAll(){
		return repository.findAll();
	}
	
	public BooksGenre findById(Long id) {
		Optional<BooksGenre> obj = repository.findById(id);
		return obj.get();
	}

}
