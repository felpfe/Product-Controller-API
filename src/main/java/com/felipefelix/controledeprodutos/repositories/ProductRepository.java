package com.felipefelix.controledeprodutos.repositories;


import com.felipefelix.controledeprodutos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository//anotação responsável pela injeção de dependencias do SpringBoot
//Classe responsável por fazer a manipulação de dados da API
public interface ProductRepository extends JpaRepository<Product, Long> {


}
