package com.felipefelix.controledeprodutos.repositories;

import com.felipefelix.controledeprodutos.entities.Category;
import com.felipefelix.controledeprodutos.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component//anotação responsável pela injeção de dependencias do SpringBoot

//Classe responsável por fazer a manipulação de dados da API
public class ProductRepository {
    private Map<Long, Product> map = new HashMap<>();

    public void save(Product obj){

        map.put(obj.getId(), obj);

    }
    //metodo que busca determinado id e retorna ele
    public Product findById(Long id){

    return map.get(id);

    }

    //metodo que acessa todos os valores e retorna uma nova lista com eles
    public List<Product> findAll(){

        return new ArrayList<Product>(map.values());

    }

}
