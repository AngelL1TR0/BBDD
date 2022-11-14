package org.example.dao;

import org.example.entity.ProductEntity;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
    /**
     * Inserta productos
     * @param products {@link List <ProductEntity>} Lista de productos
     * @return Entero que identifica el número de inserciones realizadas
     * @throws SQLException Excepcion de base de datos
     */
    int insertProducts(List<ProductEntity> products) throws SQLException;
}
