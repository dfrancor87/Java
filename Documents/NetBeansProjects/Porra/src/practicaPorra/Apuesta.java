package practicaPorra;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Esta clase define metodos para obtener datos de la base de datos apuestas
 *
 * @author Danny Franco
 */
public class Apuesta {

    private BaseDatosSingleton bd;
    private ResultSet rs;

    public Apuesta(BaseDatosSingleton bd) {
        this.bd = bd;
    }

    /**
     * Metodo para crear la tabla y hacer insert con los parámetros recibidos
     *
     * @param id
     * @param apuesta
     * @param resultado
     */
    public void altaApuesta(int id, double apuesta, String resultado) {
        try {
            String crearTabla = "CREATE TABLE IF NOT EXISTS apuestas (id INTEGER PRIMARY KEY AUTOINCREMENT, id_usuario INTEGER UNIQUE, "
                    + "apuesta REAL, resultado VARCHAR(40), FOREIGN KEY(id_usuario) REFERENCES  usuariosRegistrados(id))";
            bd.modificar(crearTabla);
            String ferInsert = "INSERT INTO apuestas (id_usuario, apuesta, resultado) VALUES (" + id + "," + apuesta + ",'" + resultado + "')";
            System.out.println(ferInsert);
            bd.modificar(ferInsert);
            System.out.println("Insert efectuado");

        } catch (Exception e) {
            System.out.println("Usted ya ha hecho una apuesta!!!");
        }
    }

    /**
     * Método que devuelve un select de la tabla apuestas
     */
    public void selectApuestas() {
        try {
            String ferSelect = "SELECT * FROM apuestas";
            ResultSet rs = bd.consultar(ferSelect);

            while (rs.next()) {
                int id = rs.getInt("id");
                int id_usuario = rs.getInt("id_usuario");
                double apuesta = rs.getDouble("apuesta");
                String resultado = rs.getString("resultado");
                System.out.println("Numero de apuesta: " + id + " | id_usuario: " + id_usuario + " | apuesta: " + apuesta + "€ | resultado: " + resultado);

            }
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }
    }

    /**
     * Método para comprobar si el usuaio está registrado
     *
     * @param dni
     * @return true o false dependiendo si existe o no
     */
    public boolean comprobarUsuarioRegistrado(String dni) {
        try {
            String ferSelect = "SELECT dni FROM usuariosRegistrados WHERE dni = '" + dni + "'";
            ResultSet rs = bd.consultar(ferSelect);

            String selectDni = rs.getString("dni");
            if (dni.equals(selectDni)) {
                System.out.println("Usuario registrado");
                return true;
            } else {
                System.out.println("Usuario no existe");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error sql" + e);
        }
        return false;
    }

    /**
     * Método que retorna el número total de apuestas realizadas
     *
     * @return cantidad de apuestas realizadas
     */
    public int totalDeApuestas() {
        String comptarApostes = "SELECT count(*) FROM APUESTAS";
        int numApostes = 0;
        try {
            rs = bd.consultar(comptarApostes);
            numApostes = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return numApostes;
    }

    /**
     * Método que retorna el número total acertantes
     *
     * @param resultadoPartido
     * @return cantidad de acertantes
     */
    public int numeroDeAcertantes(String resultadoPartido) {
        String totalGanadores = "SELECT count(resultado) FROM APUESTAS WHERE resultado = '" + resultadoPartido + "'";
        int numeroAcertantes = 0;
        try {
            rs = bd.consultar(totalGanadores);
            numeroAcertantes = rs.getInt(1);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return numeroAcertantes;
    }

    /**
     * Metodo que comprueba si el usuario ha sido ganador o no
     *
     * @param id_user
     * @param resultadoPartido
     * @return true o false dependiendo si acierta el resultado
     */
    public boolean ganador(int id_user, String resultadoPartido) {
        //hacer un select where resultado = a variables resultado de main 
        // guardar nombre de ganador el dinero y el resutado
        try {
            String ferSelect = "SELECT id_usuario, apuesta, resultado FROM apuestas WHERE id_usuario=" + id_user + " and resultado = '" + resultadoPartido + "'";
            // System.out.println(ferSelect);
            ResultSet rs = bd.consultar(ferSelect);

            while (rs.next()) {
                int id_usuario = rs.getInt("id_usuario");
                double apuesta = rs.getDouble("apuesta");
                String resultado = rs.getString("resultado");
                System.out.println("¡¡¡Has ganado!!!");
               // System.out.println("Id_usuario: " + id_usuario + " apuesta: " + apuesta + " Resultado: " + resultado);
                return true;
            }
        } catch (SQLException e) {
            System.out.println();
        }
        return false;

    }

    /**
     * Metodo para obtener la cantidad de dinero que ha apostado el usuario
     *
     * @param id_usuario
     * @param resultadoPartido
     * @return el dinero apostado
     */
    public double cantidadApostada(int id_usuario, String resultadoPartido) {
        double cantidad = 0;
        try {
            String ferSelect = "SELECT * FROM apuestas WHERE  resultado = '" + resultadoPartido + "' and id_usuario = '" + id_usuario + "'";
            //System.out.println(ferSelect);
            ResultSet rs = bd.consultar(ferSelect);

            while (rs.next()) {
                cantidad = rs.getDouble("apuesta");

            }
        } catch (SQLException e) {
            System.out.println();
        }
        return cantidad;
    }
}