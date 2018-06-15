package practicaPorra;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase que define métodos para obtener o insertar datos de la
 * tabla usuariosRegistrados
 * @author Danny Franco
 */
public class Usuario {

    private BaseDatosSingleton bd;
    private ResultSet rs;

    public Usuario(BaseDatosSingleton bd) {
        this.bd = bd;
    }
/**
 * Método que recibe parámetros para hacer un insert
 * en la tabla usuariosRegistrados
 * @param dni
 * @param nombre 
 */
    public void registrarUsuario(String dni, String nombre) {
        try {

            String crearTabla = "CREATE TABLE IF NOT EXISTS usuariosRegistrados (id INTEGER PRIMARY KEY AUTOINCREMENT, dni VARCHAR(9) NOT NULL, nombre VARCHAR(40) NOT NULL)";
            bd.modificar(crearTabla);

            String ferInsert = "INSERT INTO usuariosRegistrados (dni, nombre)  VALUES ('" + dni + "','" + nombre + "')";
            //System.out.println(ferInsert);
            bd.modificar(ferInsert);
            System.out.println("Insert efectuado");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Ha ocurrido un error");
        }
    }
/**
 * Método que hace un select de la tabla usuariosRegistrados
 */
    public void usuariosRegistrados() {
        try {
            String ferSelect = "SELECT * FROM usuariosRegistrados";
            ResultSet rs = bd.consultar(ferSelect);

            while (rs.next()) {
                int id = rs.getInt("id");
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                System.out.println("ID: "+id+" | DNI: " + dni + " | nombre: " + nombre);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

    }

    /**     
     * método que hace una consulta a la base de datos
     * para obtener el id de un usuario registrado
     * @param dni
     * @return id devuelve el id del dni de la consulta
     */
    public int obtenerId(String dni) {
        int id = 0;
        try {
            String ferSelect = "SELECT id FROM usuariosRegistrados WHERE dni = '" + dni + "'";
            ResultSet rs = bd.consultar(ferSelect);
            id = rs.getInt("id");
        } catch (Exception e) {
            System.out.println("Error sql" + e);
        }
        return id;
    }

}
