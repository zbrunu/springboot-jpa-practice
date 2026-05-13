package com.librarycollection.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarycollection.library.entities.BooksGenre;

public interface BooksGenreRepository extends JpaRepository<BooksGenre, Long> {

}
