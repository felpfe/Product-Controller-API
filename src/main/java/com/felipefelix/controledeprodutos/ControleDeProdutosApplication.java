package com.felipefelix.controledeprodutos;

import com.felipefelix.controledeprodutos.entities.Category;
import com.felipefelix.controledeprodutos.entities.Product;
import com.felipefelix.controledeprodutos.repositories.CategoryRepository;
import com.felipefelix.controledeprodutos.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
//command line runner -> interface qeu faz com que o que esteja no corpo de seu metodo seja executado no inicio da aplicação
public class ControleDeProdutosApplication implements CommandLineRunner {

	@Autowired //ingestão de dependência
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ControleDeProdutosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Food");
		Category cat4 = new Category(null, "Cleanning");
		Category cat5 = new Category(null, "Personalization");
		Category cat7 = new Category(null, "Convenience");
		Category cat8 = new Category(null, "Construction Material");


		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		categoryRepository.save(cat4);
		categoryRepository.save(cat5);
		categoryRepository.save(cat7);
		categoryRepository.save(cat8);

	}
}
