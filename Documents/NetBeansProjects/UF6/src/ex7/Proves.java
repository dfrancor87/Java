package ex7;

import java.sql.Connection;

/**
 * Utilitzem una base de dades que te una connexio unica, tipus singleton
 *
 * @author Montse
 * @version març 2018
 */
public class Proves {

    public static void main(String[] args) {
        //String nomDriver = "org.sqlite.JDBC";
        String nomBaseDades = "exempleSingleton.sqlite";
        String jdbc = "jdbc:sqlite";
        String urlJDBC = jdbc + ":" + nomBaseDades;

        try {
            BaseDadesSingleton bd = new BaseDadesSingleton(urlJDBC);

            // Connection c = BaseDadesSingleton.getConnexio(urlJDBC);
            String crearTaula = "CREATE TABLE IF NOT EXISTS professors (id INTEGER, nom varchar(100))";

            bd.modificar(crearTaula);
            String ferInsert = "INSERT INTO professors VALUES (16,'Danny12')";
            bd.modificar(ferInsert);
            System.out.println("Insert efectuat");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
