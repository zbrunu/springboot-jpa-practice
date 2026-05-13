package com.librarycollection.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarycollection.library.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
