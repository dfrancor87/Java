package ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * En aquesta versió, el constructor i la crida a la connexió retornen
 * l'excepció. D'aquesta manera es pot gestionar en la classe que utilitza la
 * bbdd. També retornem la connexió, no utilitzem statement directament.
 * Només servei per "amagar" el Class.forName i el DriverManager
 * 
 * 
 * @version març 2017
 * @author Montse
 */
public class BaseDades {

    private String urlBaseDades;
    protected Connection conn = null; //es protected pq l'utilitza ex4
    private Statement stmt = null;

    public BaseDades(String url)throws Exception {
        
        urlBaseDades = url;
       
    }

    //getter de la connexió
    public Connection getConnexio() throws Exception {
        conn = DriverManager.getConnection(urlBaseDades);
        stmt = conn.createStatement();
        return conn;
    }

//    private void connectarBBDD() throws Exception {
//        // try {
//        Class.forName(nomDriver);
//        conn = DriverManager.getConnection(urlBaseDades);
        // stmt = conn.createStatement();

        // } catch (Exception e) {
        //Possibles errors de carregar el driver o connectar-se a la bbdd
        //   System.err.println(e);
        //s'hauria de tancar la connexió si hi ha excepció
        //  tancarConnexioBBDD();
        // }
//    }

    public void tancarConnexioBBDD() {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (Exception ignore) {
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception ignore) {
            }
        }
    }
    public ResultSet consultar(String instruction) throws SQLException {
        return stmt.executeQuery(instruction);
    }
    public void modificar(String instruction) throws SQLException {
        stmt.executeUpdate(instruction);
    }
}
