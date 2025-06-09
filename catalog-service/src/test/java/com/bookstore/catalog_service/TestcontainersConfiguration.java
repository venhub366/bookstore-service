package com.bookstore.catalog_service;

import org.springframework.boot.SpringApplication;

class TestcontainersConfiguration {

  public static void main(String[] args) {
    SpringApplication.from(CatalogServiceApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
