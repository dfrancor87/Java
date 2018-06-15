
package ex7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Montse
 * @version març 2018
 */
public class Llistat {

    public static void main(String[] args) {

        // registrar el Driver jdbc
        //String nomDriver = "org.sqlite.JDBC";
        try {
            //Class.forName(nomDriver); //A partir de la versió jdbc 4.0 no cal, jdk 6.0
            //Formar l'URL per connectar a la base de dades
            String nomBaseDades = "exempleSingleton.sqlite";

            String jdbc = "jdbc:sqlite";
            String urlJDBC = jdbc + ":" + nomBaseDades; // crea el nombre de la base de datos            

            String ferSelect = "SELECT * FROM professors"; // hace un select
            BaseDadesSingleton bd = new BaseDadesSingleton(urlJDBC);
            
            ResultSet rs =    bd.consultar(ferSelect);

            while (rs.next()) {
                int num = rs.getInt("id");
                System.out.print("Num=" + num + " ");
                String resultat = rs.getString("nom");
                System.out.print(resultat + "\n");
            }

            rs.close();
            bd.tancarConnexioBBDD();

        } catch (Exception e) {
            //Problemes de tot tipus,
            //ClassCastException
            //SQLException etc
            System.out.println("Si arriba aquí hi ha algun error");
            System.err.println(e);
        }
    }
}
