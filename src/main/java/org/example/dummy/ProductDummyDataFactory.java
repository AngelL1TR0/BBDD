package org.example.dummy;

import org.example.entity.ProductEntity;
import org.example.entity.ProductTypeEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductDummyDataFactory {
    public static List<ProductEntity> generateProductList(String name, long idType, String size, String color,
                                                          BigDecimal price, BigDecimal discount, int stock, long collection, long idStatus) {
        List<ProductEntity> productEntities = new ArrayList<>();
        for (int i = 0; i < stock; i++) {
            ProductEntity productEntity = new ProductEntity();
            productEntity.setName(name);

            ProductTypeEntity productTypeEntity = new ProductTypeEntity();
            productTypeEntity.setId(idType);
            productEntity.setTipo(productTypeEntity);
        }
    }
}
