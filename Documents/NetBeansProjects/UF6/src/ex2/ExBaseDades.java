package ex2;

import java.sql.Connection;
import java.sql.ResultSet;


/** Ús de la classe BaseDades
 *
 * @author Montse
 */
public class ExBaseDades {

    public static void main(String[] args) {

        //Amb MySQL seria:
        //Si es fa servir MySQL anar a: https://dev.mysql.com/downloads/connector/j/
        //El nom del driver es com.mysql.jdbc.Driver
        //conn = DriverManager.getConnection("jdbc:mysql://hostname:port/dbname","username", "password");
        
        String nomDriver = "org.sqlite.JDBC";
        String nomBaseDades = "exemple2.sqlite";
        String jdbc = "jdbc:sqlite";
        String urlJDBC = jdbc + ":" + nomBaseDades;
        String ferSelect = "SELECT * FROM professors";
        String crearTaula = "CREATE TABLE IF NOT EXISTS professors (codi INTEGER PRIMARY KEY, nom varchar(100), ratio INTEGER)";
        String ferInsert = "INSERT INTO professors VALUES (1,'Isabel',38)";
        //un cop es crea la bbdd, en el moment d'instanciar 
        //s'intenta connectar,etc


       try{
            BaseDades bd = new BaseDades(urlJDBC);
            Connection c = bd.getConnexio();
            bd.modificar(crearTaula);
            ResultSet rs=bd.consultar(ferSelect);
            while (rs.next()) {
                String resultat = rs.getString("nom");              
                System.out.println(resultat);
                int n=rs.getInt(3); //els camps comencen en 1,2,3
                System.out.println("ratio="+n);
            }
            rs.close();
            c.close();

        } catch (Exception e) {
            //Problemes de tot tipus,
            //ClassCastException
            //SQLException etc           
            System.out.println(e);
        }
    }
}
