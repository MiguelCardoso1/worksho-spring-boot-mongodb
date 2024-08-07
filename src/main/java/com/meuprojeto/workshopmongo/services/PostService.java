package com.meuprojeto.workshopmongo.services;

import com.meuprojeto.workshopmongo.domain.Post;
import com.meuprojeto.workshopmongo.domain.User;
import com.meuprojeto.workshopmongo.dto.UserDTO;
import com.meuprojeto.workshopmongo.repository.PostRepository;
import com.meuprojeto.workshopmongo.repository.UserRepository;
import com.meuprojeto.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public List<Post> findByTitle(String text) {
        return repo.findByTitle(text);
    }
}
