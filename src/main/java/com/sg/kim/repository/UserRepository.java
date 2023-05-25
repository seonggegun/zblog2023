package com.sg.kim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.kim.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}