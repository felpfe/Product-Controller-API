package com.felipefelix.controledeprodutos.resource;

import com.felipefelix.controledeprodutos.entities.Category;
import com.felipefelix.controledeprodutos.entities.Product;
import com.felipefelix.controledeprodutos.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController //faz com que o spring reconheça a classe como um serviço
@RequestMapping("/Products") //mapeia o caminho da url
public class ProductResource {

    @Autowired
    private ProductRepository productRepository;
    private Category category;
    private Product product;


    //anotação GetMapping faz com que o metodo seja a resposta
    // para a requisição HTTP de get
    @GetMapping //define o metodo como a resposta ao comando HTTP de get
    public ResponseEntity<List<Product>> findAll(){
        List<Product> list = productRepository.findAll();
        return  ResponseEntity.ok() //ResponseEntity define a resposta de uma forma mais bonitinha
                .body(list);
    }



    @RequestMapping("/newProduct")
    @PostMapping
    public void inserir(@RequestBody Product product){
        productRepository.save(product);
    }

    @RequestMapping("/delete")
    @DeleteMapping
    public void deletar(@RequestBody Product product){
        productRepository.delete(product);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product cat = productRepository.findById(id).get();
        return ResponseEntity.ok()
                .body(cat);
    }

}
