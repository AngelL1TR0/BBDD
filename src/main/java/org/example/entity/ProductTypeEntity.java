package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductTypeEntity {
    private long id;
    private String name;
    private String creationUser;
    private Date creationDate;
    private String modificationUser;
    private Date modificationDate;
}

