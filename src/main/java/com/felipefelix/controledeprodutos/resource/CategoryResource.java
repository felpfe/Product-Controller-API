package com.felipefelix.controledeprodutos.resource;

import com.felipefelix.controledeprodutos.entities.Category;
import com.felipefelix.controledeprodutos.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //faz com que o spring reconheça a classe como um serviço
@RequestMapping("/categories") //mapeia o caminho da url
public class CategoryResource {

    @Autowired
    private CategoryRepository categoryRepository;

    //anotação GetMapping faz com que o metodo seja a resposta
    // para a requisição HTTP de get
    @GetMapping //define o metodo como a resposta ao comando HTTP de get
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = categoryRepository.findAll();
        return ResponseEntity.ok() //ResponseEntity define a resposta de uma forma mais bonitinha
                .body(list);
    }

    @RequestMapping("/newCategorie")
    @PostMapping
    public void inserir(@RequestBody Category category){
        categoryRepository.save(category);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category cat = categoryRepository.findById(id).get();
        return ResponseEntity.ok()
                .body(cat);
    }
}
