package cz.czechitas.java2webapps.ukol7.controller;

import cz.czechitas.java2webapps.ukol7.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {

    public PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public ModelAndView seznamPostu(Pageable pageable) {
        return new ModelAndView("postList").addObject("posts", postService.seznamPostu(pageable));
    }


    @GetMapping("/detail/{slug}")
    public ModelAndView detail(@PathVariable String slug) {
        return new ModelAndView("postDetail").addObject("singlePost", postService.singlePost(slug));
    }

}
