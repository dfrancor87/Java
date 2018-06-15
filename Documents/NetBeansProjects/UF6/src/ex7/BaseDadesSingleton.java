
package ex7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** Per fer la connexió aplicarem el patró de disseny Singleton, per tenir una
 *  única connexió a la bbdd.
 * @version març de 2018
 * @author Montse
 */
public class BaseDadesSingleton {
    
    private Statement stmt = null;
    
    private static Connection conn = null;
        
    
    //mètode static per obtenir la única connexió
    private static Connection getConnexio(String url) throws Exception{
        if(conn==null){
            //només es fa la connexió, la primera vegada, quan conn es null
            conn=DriverManager.getConnection(url);
        }
        return conn;
    }
    
    public BaseDadesSingleton(String url) throws Exception{
        getConnexio(url);
        stmt=conn.createStatement();
        
    }
    
        

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
