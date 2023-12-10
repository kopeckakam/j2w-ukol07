package cz.czechitas.java2webapps.ukol7.service;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import cz.czechitas.java2webapps.ukol7.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;

@Service
public class PostService {
    public PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Page<Post> seznamPostu(Pageable pageable) {
        return postRepository.findAllByOrderByPublishedDesc(PageRequest.of(0, 20), pageable);
    }

    public Post singlePost(String slug) {
        return postRepository.findBySlug(slug);
    }

}
