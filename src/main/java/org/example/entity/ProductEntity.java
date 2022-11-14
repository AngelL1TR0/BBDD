package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    private long id;
    private String barcode;
    private String name;
    private CollectionEntity collection;
    private ProductTypeEntity type;
    private String size;
    private String colour;
    private BigDecimal price;
    private BigDecimal discount;
    private ProductStatusEntity status;
    private String creationUser;
    private Date creationDate;
    private String modificationUser;
    private Date modificationDate;
}