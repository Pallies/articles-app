package fr.diginamic.articles.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.articles.entities.Article;
import fr.diginamic.articles.services.ArticleService;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @GetMapping
    public ResponseEntity<List<Article>> findAllArticles() {
        List<Article> articles =service.getAll();
        return ResponseEntity.ok().body(articles);
    }

    @PostMapping
    public ResponseEntity<Article> save(@RequestBody Article article) {
        return ResponseEntity.ok().body(service.save(article));
    }
}
