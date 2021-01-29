package fr.tutojavaexe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
  Hello world!
*/

public final class App {
    private App() {
    }

    /*
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     * 
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
        /* Connexion à la base de données */
        String url = "jdbc:mysql://127.0.0.1:3306/newschema";
        String utilisateur = "root";
        String motDePasse = "Simon59300sql";
        Connection connexion = null;

        try {
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println("conn ok");
            /*
             * Ici, nous placerons nos requêtes vers la BDD / ...
             */

        } catch (SQLException e) {

            /* Gérer les éventuelles erreurs ici */
            System.out.println(e.getMessage());
            System.out.println("erreur conn");

        } finally {
            if (connexion != null)
                try {
                    /* Fermeture de la connexion */
                    connexion.close();
                } catch (SQLException ignore) {
                    /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
                }
        }
    }
}