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
        List<ProductEntity> products = ProductDummyDataFactory.generateProductList();

        productService.insertProduct();
    }
}
