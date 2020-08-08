create database manut_filmes;

use manut_filmes;

create table generos (
  id_gen int not null auto_increment,
  genero varchar(60) not null,
  primary key (id_gen),
  unique index id_gen_UNIQUE (id_gen asc) visible);
  
insert into generos (genero) values ('Ação');
insert into generos (genero) values ('Animação');
insert into generos (genero) values ('Aventura');
insert into generos (genero) values ('Chancharada');
insert into generos (genero) values ('Comédia');
insert into generos (genero) values ('Dança');
insert into generos (genero) values ('Documentário');
insert into generos (genero) values ('Drama');
insert into generos (genero) values ('Espionagem');
insert into generos (genero) values ('Faroeste');
insert into generos (genero) values ('Fantasia');
insert into generos (genero) values ('Ficção Científica');
insert into generos (genero) values ('Guerra');
insert into generos (genero) values ('Musical');
insert into generos (genero) values ('Policial');
insert into generos (genero) values ('Romance');
insert into generos (genero) values ('Suspense');
insert into generos (genero) values ('Terror');
insert into generos (genero) values ('Thriller');

select * from generos;

create table filmes (
  id_filme int not null auto_increment,
  titulo varchar(100) not null,
  diretor varchar(60) not null,
  genero_id int not null,
  sinopse text null,
  ano year null,
  primary key (id_filme),
  unique index id_filme_UNIQUE (id_filme asc) visible,
  constraint genero_id
    foreign key (genero_id)
    references generos(id_gen));
  

  
  
	