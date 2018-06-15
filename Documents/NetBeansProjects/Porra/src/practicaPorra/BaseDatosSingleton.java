package practicaPorra;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Danny Franco
 */
public class BaseDatosSingleton {

    private Statement stmt = null;
    private static Connection conn = null;

    private static Connection getConnexio(String url) throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url);
        }
        return conn;
    }

    public BaseDatosSingleton(String url) throws SQLException {
        getConnexio(url);
        stmt = conn.createStatement();
    }

    public void cerrarConexcionBD() {
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

    public ResultSet consultar(String consulta) throws SQLException {
        return stmt.executeQuery(consulta);
    }

    public void modificar(String instruction) throws SQLException {
        stmt.executeUpdate(instruction);
    }

}
