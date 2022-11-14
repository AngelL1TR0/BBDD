package org.example.service;

import org.example.dao.ProductDAO;
import org.example.dao.ProductDAOImpl;
import org.example.entity.ProductEntity;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    ProductDAO productDAO = new ProductDAOImpl();

    /**
     * Sirve para insertar una lista de productos
     * @param products {@link List<ProductEntity>} Lista de productos
     */
    public void insertProducts(List<ProductEntity> products) {
        try {
            int rows = productDAO.insertProducts(products);
            System.out.println("Número de filas insertadas: " + rows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
