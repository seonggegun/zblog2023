package com.sg.kim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sg.kim.domain.Post;
import com.sg.kim.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	@Transactional
	public void insertPost(Post post) {
		postRepository.save(post);
	}

}
