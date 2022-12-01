create table articles (
    id int not null auto_increment,
    libelle varchar(50) not null,
    prix float not null,
    primary key (id)
);

insert into articles(libelle,prix) values ("melon",1.15);
insert into articles(libelle,prix) values ("cerise",4.45);
insert into articles(libelle,prix) values ("tomate",3.15);
insert into articles(libelle,prix) values ("salade",0.95);
insert into articles(libelle,prix) values ("carotte",1.45);
insert into articles(libelle,prix) values ("pomme de terre",5.03);