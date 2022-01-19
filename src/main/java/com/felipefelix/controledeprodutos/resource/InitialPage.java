package com.felipefelix.controledeprodutos.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InitialPage {

    @GetMapping
    @ResponseBody
    public String response(){
        return "Sobre\n" +
                "Esse projeto consiste de uma API de controle de produtos utilizando SpringBoot e arquitetura Rest. " +
                "Os produtos podem ser adicionados e/ou consultado na API por meio de metodos HTTP: GET, POST, " +
                "DELETE(em desenvolvimento...)\n" +
                "\n" +
                "\n" +
                "O que verá?\n" +
                "\n" +
                "Projeto Java + Spring Boot + Maven\n" +

                "Injeção de depedências no Spring\n" +
                "Rest/Web Services\n" +
                "Spring JPA e Banco H2\n" +
                "\n" +
                "Requisitos\n" +
                "\n" +
                "Java 11\n" +
                "SpringBoot\n" +
                "Maven\n" +
                "Spring Data JPA e H2 banco\n" +
                "\n" +
                "Passo-a-passo\n" +
                "\n" +
                "Para criar um novo produto\n" +
                "Utilize o método post na URL: http://localhost:8080/Products/newProduct\n" +
                "No corpo da requisição insira os dados do produto como o exemplo a seguir:\n" +
                "{ \"name\": \"Iphone 8\", \"price\": 2800.0, \"category\": { \"id\": 1, \"name\": \"Eletronics\" } }\n" +
                "\n" +
                "Para criar uma nova categoria\n" +
                "Utilize o método post na URL: http://localhost:8080/categories/newCategorie\n" +
                "No corpo da requisição insira os dados da categoria como o exemplo a seguir:\n" +
                "{ \"name\":\"Eletronics\" }\n" +
                "\n" +
                "Para deletar uma categoria/produto:\n" +
                "Utilize o método DELETE na URL: http://localhost:8080/categories/delete\n" +
                "No corpo da requisição insira os dados da categoria/produto como o exemplo a seguir:\n" +
                "{\"id\": 1, \"name\": \"Eletronics\"}\n" +
                "\n" +
                "- Ou para produtos:\n" +
                "\n" +
                "{\"name\": \"Iphone 8\",\n" +
                "    \"price\": 2800.0,\n" +
                "    \"category\": {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"Eletronics\"}}\n" +
                "OBS.: O id tanto de produtos quanto de categorias novas é gerado automaticamente e " +
                "serializado pelo código do próprio programa, sendo apenas essêncial passar" +
                " o id da categoria a qual o produto pertence no momento da criação de um novo produto.";
    }
}
