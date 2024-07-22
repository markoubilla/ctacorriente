package com.platinum;

import static org.junit.Assert.assertNotNull;
import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class DatabaseConnectionTest {
    @Test
    public void testConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Cuentas_clientes", "root", "password");
            assertNotNull(conn);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
