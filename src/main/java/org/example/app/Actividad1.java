package org.example.app;

import org.example.dummy.ProductDummyDataFactory;
import org.example.entity.ProductEntity;
import org.example.service.ProductService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Actividad1 {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        List<ProductEntity> products = ProductDummyDataFactory.generateProductList("Camiseta Friends",
                "840123401232", 3, "M", "Azul", new BigDecimal("8.00"),
                null, 100, 2, 1);
        productService.insertProducts(products);
        products = ProductDummyDataFactory.generateProductList("Camiseta Friends",
                "840123401231", 3, "S", "Azul", new BigDecimal("8.00"),
                null, 100, 2, 1);
        productService.insertProducts(products);
        products = ProductDummyDataFactory.generateProductList("Camiseta Friends",
                "840123401233", 3, "L", "Azul", new BigDecimal("8.00"),
                null, 100, 2, 1);
        productService.insertProducts(products);
    }
}