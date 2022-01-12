package com.felipefelix.controledeprodutos.repositories;

import com.felipefelix.controledeprodutos.entities.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component//anotação responsável pela injeção de dependencias do SpringBoot

//Classe responsável por fazer a manipulação de dados da API
public class CategoryRepository {
    private Map<Long, Category> map;

    public void save(Category obj){

        map.put(obj.getId(), obj);

    }
    //metodo que busca determinado id e retorna ele
    public Category findById(Long id){

    return map.get(id);

    }

    //metodo que acessa todos os valores e retorna uma nova lista com eles
    public List<Category> findAll(){

        return new ArrayList<Category>(map.values());

    }

}
