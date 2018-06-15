package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 * Primer exercici per connectar-se i utilitzar una bbdd SQLite amb jdbc
 *
 * @author Montse
 * @version març 2017
 */
public class Exercici1JDBCSqLite {

    public static void main(String[] args) {
        //Variables-objectes a utilitzar    
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        // registrar el Driver jdbc
        //String nomDriver = "org.sqlite.JDBC";
        try {
            //Class.forName(nomDriver); //A partir de la versió jdbc 4.0 no cal, jdk 6.0
            //Formar l'URL per connectar a la base de dades
            String nomBaseDades = "exemple1.sqlite";
         
            String jdbc = "jdbc:sqlite";
            String urlJDBC = jdbc + ":" + nomBaseDades;
        

           // int timeout = 30;
           // String crearTaula = "CREATE TABLE IF NOT EXISTS alumnes (id INTEGER PRIMARY KEY, nom varchar(100))";
           // INSERT INTO alumnes VALUES(null, 'Steven Spielberg') fa autoincremental
            String ferInsert = "INSERT INTO alumnes VALUES(605, 'Danny Franco')";
            String ferSelect = "SELECT * FROM alumnes";

            // Crear la connexió a la base de dades
            conn = DriverManager.getConnection(urlJDBC);
        
            stmt = conn.createStatement();
            // stmt.setQueryTimeout(timeout);
            // stmt.executeUpdate(crearTaula);
            //Si la base de dades no existeix, la crea
            stmt.executeUpdate(ferInsert);
            // stmt.executeUpdate("insert into alumnes values (23,'Montse')");
            rs = stmt.executeQuery(ferSelect);
           // stmt.executeQuery("select * from professors where id=98");

            while (rs.next()) {
                int num = rs.getInt("id");
                System.out.print("Num=" + num + " ");
                String resultat = rs.getString("nom");
                System.out.print(resultat + "\n");
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            //Problemes de tot tipus,
            //ClassCastException
            //SQLException etc
            System.out.println("Si arriba aquí hi ha algun error");
            System.err.println(e);
        }

    }
}
