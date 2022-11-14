package org.example.dao;

import org.example.dummy.Usuarios;
import org.example.entity.ProductEntity;
import org.example.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;
public class ProductDAOImpl implements ProductDAO {
    @Override
    public int insertProducts(List<ProductEntity> products) throws SQLException {
        try (Connection connection = ConnectionPool.getDataSource().getConnection()) {
            connection.setAutoCommit(false);
            int rowCount = 0;
            for (ProductEntity product : products) {
                rowCount+=insertProduct(connection, product);
            }
            connection.commit();
            return rowCount;
        } catch (SQLException e) {
            throw e;
        }
    }


    private int insertProduct(Connection connection, ProductEntity product) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Double discount = product.getDiscount() != null ? product.getDiscount().doubleValue() : null;
            return statement.executeUpdate("INSERT INTO producto (CODIGO_BARRA, NOMBRE, COLECCION, TIPO, TALLA, COLOR, " +
                    "PRECIO, DESCUENTO, ESTADO, USU_CRE, FEC_CRE) VALUES ( '" + product.getBarcode() + "', '" + product.getName() + "', " +
                    ""+product.getCollection().getId()+", " + product.getType().getId() + ", '" + product.getSize() + "', '" + product.getColour() + "', " +
                    "" + product.getPrice().doubleValue() + ", "+discount+", " + product.getStatus().getId() + ", '" + Usuarios.USU_APP.getName()
                    + "', '"+timestamp+"')");
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        }
    }
}
