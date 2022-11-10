package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try(Connection c = DriverManager.getConnection(jdbc:postgresql://localhost:15432/postgres, postgres, postgres ))
    }
}