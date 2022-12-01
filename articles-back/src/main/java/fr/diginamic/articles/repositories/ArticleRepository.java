package fr.diginamic.articles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.articles.entities.Article;


public interface ArticleRepository extends JpaRepository<Article,Integer> {
    

}
