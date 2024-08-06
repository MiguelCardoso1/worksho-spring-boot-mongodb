package com.meuprojeto.workshopmongo.resources;

import com.meuprojeto.workshopmongo.domain.Post;
import com.meuprojeto.workshopmongo.domain.User;
import com.meuprojeto.workshopmongo.dto.UserDTO;
import com.meuprojeto.workshopmongo.services.PostService;
import com.meuprojeto.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return  ResponseEntity.ok().body(obj);
    }
}
