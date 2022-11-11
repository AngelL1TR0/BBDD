package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    private long id;
    private String barcode;
    private String name;
    private CollectionEntity coleccion;
    private ProductTypeEntity tipo;
    private String size;
    private String color;
    private BigDecimal price;
    private BigDecimal discount;
    private ProductStatusEntity estado;

}
