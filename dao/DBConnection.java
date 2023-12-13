package dao;

import java.sql.*;

public class DBConnection {

    private static final String database = "jdbc:mysql://localhost:3306/DOCTOR_VET";
    private static final String password = "";
    private static final String user = "root";
    private static Connection con = null;

    public DBConnection() {

    }

    public static Connection getConnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(database, user, password);
            } catch (ClassNotFoundException e) {
                System.out.println("Driver não encontrado: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Erro na conexão: " + e.getMessage());
            }
        }
        return con;
    }

    public static PreparedStatement getPreparedStatement(String sql) {
        if (con == null) {
            con = getConnection();
        }

        try {
            return con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Erro de sintaxe: " + e.getMessage());
        }
        return null;
    }
}
