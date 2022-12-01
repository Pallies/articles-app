package fr.diginamic.articles.entities;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String libelle;
    @Column
    private Double prix;

    public Article() { }

    public Integer getId() {
        return id;
    }
    public String getLibelle() {
        return libelle;
    }
    public Double getPrix() {
        return prix;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
