package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductStatusEntity {
    private String id;
    private String name;
    private String creationUser;
    private String creationDate;
    private String modificationUser;
    private String modificationDate;
}
