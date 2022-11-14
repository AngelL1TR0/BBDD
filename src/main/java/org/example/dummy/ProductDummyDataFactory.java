package org.example.dummy;

import org.example.entity.CollectionEntity;
import org.example.entity.ProductEntity;
import org.example.entity.ProductStatusEntity;
import org.example.entity.ProductTypeEntity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductDummyDataFactory {
    public static List<ProductEntity> generateProductList(
            String name, String barcode, long idType, String size, String colour, BigDecimal price,
            BigDecimal discount, int stock, long idCollection, long idStatus) {
        List<ProductEntity> productEntities = new ArrayList<>();
        for (int i = 0; i < stock; i++) {
            ProductEntity productEntity = new ProductEntity();
            productEntity.setName(name);
            productEntity.setBarcode(barcode);

            ProductTypeEntity productType = new ProductTypeEntity();
            productType.setId(idType);
            productEntity.setType(productType);

            productEntity.setSize(size);
            productEntity.setColour(colour);
            productEntity.setPrice(price);
            productEntity.setDiscount(discount);

            CollectionEntity collection = new CollectionEntity();
            collection.setId(idCollection);
            productEntity.setCollection(collection);

            ProductStatusEntity productStatus = new ProductStatusEntity();
            productStatus.setId(idStatus);
            productEntity.setStatus(productStatus);

            productEntities.add(productEntity);
        }
        return productEntities;
    }
}