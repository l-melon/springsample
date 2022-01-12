package com.example.springsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springsample.entity.User;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
