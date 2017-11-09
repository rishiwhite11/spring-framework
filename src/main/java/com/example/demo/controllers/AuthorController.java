package com.example.demo.controllers;

import com.example.demo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bubul on 09-11-2017.
 */
@Controller
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;

//    public AuthorController(AuthorRepository authorRepository) {
//        this.authorRepository = authorRepository;
//    }
    @RequestMapping("/authors")
    public String author(Model model){
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }

}
