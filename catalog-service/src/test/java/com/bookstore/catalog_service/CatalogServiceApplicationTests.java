package com.bookstore.catalog_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestContainerConfig.class)
@SpringBootTest
class CatalogServiceApplicationTests {

  @Test
  void contextLoads() {}
}
