package fr.diginamic.articles.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.articles.entities.Article;
import fr.diginamic.articles.repositories.ArticleRepository;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;

    // retourne la liste des articles persistées
    public List<Article> getAll() {
        return repository.findAll();
    }

    // sauvegarde l'article
    public Article save(Article article) {
        return repository.save(article);
    }
}
