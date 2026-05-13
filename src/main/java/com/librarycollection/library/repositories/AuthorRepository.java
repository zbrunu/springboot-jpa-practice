package com.librarycollection.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarycollection.library.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
