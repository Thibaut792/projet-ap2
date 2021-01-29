package fr.tutojavaexe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BDD {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/newschema";
        String name = "root";
        String password = "Simon59300sql";

        try (Connection conn = DriverManager.getConnection(dbURL, name, password)) {
            String sql = "INSERT INTO Users (AG_nom, AG_password) VALUES (?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "bill");
            statement.setString(2, "secretpass");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}