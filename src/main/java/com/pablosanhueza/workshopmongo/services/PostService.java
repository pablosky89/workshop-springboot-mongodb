package com.pablosanhueza.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pablosanhueza.workshopmongo.domain.Post;
import com.pablosanhueza.workshopmongo.repositories.PostRepository;
import com.pablosanhueza.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto no encontrado"));
	}
}
