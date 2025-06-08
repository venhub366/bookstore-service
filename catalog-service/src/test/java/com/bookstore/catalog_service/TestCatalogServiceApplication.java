package com.bookstore.catalog_service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(CatalogServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
