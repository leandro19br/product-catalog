package br.com.dio.productcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
*http://localhost:8080/actuator/health verifica se a aplicação está rodando
*  */
@SpringBootApplication
public class ProductCatalogApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductCatalogApplication.class, args);
	}

}
