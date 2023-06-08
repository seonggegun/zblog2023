package com.sg.kim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sg.kim.domain.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
}