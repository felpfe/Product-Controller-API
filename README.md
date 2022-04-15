<h4 align="center"> 
	🚧  API Product Controller 🚀 Finalizada 🚧
</h4>



<!--ts-->
   * [Sobre](#Sobre)
   * [O que verá?](#O-que-verá)
   * [Requisitos](#Requisitos)
   * [Passo-a-passo](#Passo-a-passo)
   

   
<!--te-->

Sobre 
=================
<p align="center">Esse projeto consiste de uma API de controle de produtos utilizando SpringBoot e arquitetura Rest. Os produtos podem ser adicionados e/ou consultado na API por meio de metodos HTTP: GET, POST, DELETE(em desenvolvimento...)</p>



O que verá? 
=================
* Projeto Java + Spring Boot + Maven
* Injeção de depedências no Spring
* Rest/Web Services
* Spring JPA e Banco H2

Requisitos 
=================
* Java 11
* SpringBoot
* Maven
* Spring Data JPA e H2 banco

Passo-a-passo 
=================
* Para criar um novo produto 
	- Utilize o método post na URL: http://localhost:8080/Products/newProduct
	- No corpo da requisição insira os dados do produto como o exemplo a seguir:
<p align="center">
	{
    "name": "Iphone 8",
        "price": 2800.0,
        "category": {
            "id": 1,
            "name": "Eletronics"
        }
	}
	</p>
	
* Para criar uma nova categoria 
	- Utilize o método post na URL: http://localhost:8080/categories/newCategorie
	- No corpo da requisição insira os dados da categoria como o exemplo a seguir:
<p align="center">
{
    "name":"Eletronics"
}
</p>

* Para deletar uma categoria/produto:
	- Utilize o método DELETE na URL: http://localhost:8080/categories/delete
	- No corpo da requisição insira os dados da categoria/produto como o exemplo a seguir:
<p align="center"> {"id": 1,
 "name": "Eletronics"} </p>

<p align="center">
- Ou para produtos: 
	
	{"name": "Iphone 8",
        "price": 2800.0,
        "category": {
            "id": 1,
            "name": "Eletronics"}}
	
</p>

* OBS.: O id tanto de produtos quanto de categorias novas é gerado automaticamente e serializado pelo código do próprio programa, sendo apenas essêncial passar o id da categoria a qual o produto pertence no momento da criação de um novo produto.
<p>
A documentação da API também pode ser obtida acessando o link: 
http://localhost:8080/swagger-ui/index.html#/product-resource/deletar_2
</p>

### Autor
---
  Feito com ❤️ por Felipe Felix de Almeida 👋🏽 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Felipe-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/tgmarinho/)](https://www.linkedin.com/in/felipe-felix-0729371a7/) 
[![Gmail Badge](https://img.shields.io/badge/-felipe1felixalmeida@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:tgmarinho@gmail.com)](mailto:felipe1felixalmeida@gmail.com)

