# Random Meal Generator

Este projeto é um exemplo de _backend_ para geração de receitas aleatórias utilizando Open Feign com Spring Boot consumindo a API [TheMealDB](https://www.themealdb.com/).

Foi inspirado no desafio [Random Meal Generator](https://github.com/florinpop17/app-ideas/blob/master/Projects/1-Beginner/Random-Meal-Generator.md) proposto no [App Ideas Colletion](https://github.com/florinpop17/app-ideas).  

## Tabela de conteúdos

   * [Sobre](#lista-de-livros)
   * [Tecnologias utilizadas](#tecnologias-utilizadas)
   * [Ferramentas utilizadas](#ferramentas-utilizadas)
   * [Dependências utilizadas](#dependências-utilizadas)
   * [Como executar o projeto](#como-executar-o-projeto)
     * [Pré-requisitos](#pré-requisitos)
     * [Execução](#execução)
   * [Endpoint](#endpoint)
   * [Autora](#autora)

## Tecnologias utilizadas

As seguintes tecnologias foram utilizadas na construção do projeto:

   * Java
   * Maven
   * Spring Boot

## Ferramentas utilizadas

As seguintes ferramentas foram utilizadas na construção do projeto:

   * [JDK](https://www.oracle.com/java/technologies/downloads/) | Versão 11.0.11
   * [Postman](https://www.postman.com/downloads/) | Versão 8.11.1
   * [Spring Tool Suite](https://spring.io/tools) | Versão 4.11.0

## Dependências utilizadas

| Nome                                                                               |                                          Descrição                                          |
| -------------------------------------------------------------------------------------------- | :-----------------------------------------------------------------------------------------: |
| [lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok)                                               |                   Framework para geração de métodos getters e setters, construtores e entre outros                |
| [spring-cloud-starter-openfeign](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-openfeign)                                               |              Cliente REST declarativo para Spring Boot                    |

## Como executar o projeto

### Pré-requisitos

Para que seja possível executar o projeto, é necessário que em sua máquina estejam instalados:

   * [Git](https://git-scm.com/)
   * JDK
   * Postman
   * Spring Tool Suite

### Execução

1. Abra um terminal do Git na pasta desejada e clone este repositório:
```bash
$ git clone https://github.com/AnaBilecki/random-meal-generator
```
2. Em seguida, abra o projeto no Spring Tool Suite e o execute.
3. O servidor iniciará na porta 8080. Após iniciado, realize a geração aleatória de uma receita pelo Postman.

## Endpoint

O _endpoint_ para retornar uma receita aleatória é GET **/meal**.

## Autora

Ana Carolina Bilecki
