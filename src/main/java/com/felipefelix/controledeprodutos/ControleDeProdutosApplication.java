package com.felipefelix.controledeprodutos;

import com.felipefelix.controledeprodutos.entities.Category;
import com.felipefelix.controledeprodutos.entities.Product;
import com.felipefelix.controledeprodutos.repositories.CategoryRepository;
import com.felipefelix.controledeprodutos.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");
		Category cat3 = new Category(3L, "Food");
		Category cat4 = new Category(4L, "Cleanning");
		Category cat5 = new Category(5L, "Personalization");
		Category cat7 = new Category(7L, "Convenience");
		Category cat8 = new Category(8L, "Construction Material");

		Product p1 = new Product(1L, "TV", 2200.00, cat1);
		Product p2 = new Product(2L, "Alice in Wonderland", 30.00, cat2);
		Product p3 = new Product(3L, "Rice", 8.00, cat3);
		Product p4 = new Product(4L, "Soap", 0.99, cat4);
		Product p5 = new Product(5L, "Paint", 10.00, cat5);
		Product p6 = new Product(6L, "Coca-cola 500ml", 3.00, cat7);
		Product p7 = new Product(7L, "Tiles", 10.00, cat8);
		Product p8 = new Product(8L, "PC", 1800.00, cat1);
		Product p9 = new Product(9L, "Notebook", 2800.00, cat1);

		cat1.getProducts().addAll(Arrays.asList(p1, p8, p9));
		cat2.getProducts().addAll(Arrays.asList(p2));
		cat3.getProducts().addAll(Arrays.asList(p3));
		cat4.getProducts().addAll(Arrays.asList(p4));
		cat5.getProducts().addAll(Arrays.asList(p5));
		cat7.getProducts().addAll(Arrays.asList(p6));
		cat8.getProducts().addAll(Arrays.asList(p7));

		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		categoryRepository.save(cat3);
		categoryRepository.save(cat4);
		categoryRepository.save(cat5);
		categoryRepository.save(cat7);
		categoryRepository.save(cat8);

		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		productRepository.save(p6);
		productRepository.save(p7);
		productRepository.save(p8);
		productRepository.save(p9);
	}
}
