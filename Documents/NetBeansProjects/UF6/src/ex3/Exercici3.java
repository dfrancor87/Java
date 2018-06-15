package ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Per provar PreparedStatement
 *
 * @author Montse
 * @version març 2016
 */
public class Exercici3 {

    public static void main(String[] args) {
//Variables-objectes a utilitzar    
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;

// registrar el Driver jdbc
// Això des de la versió jdk 6 ja no cal fer-ho
//  String nomDriver = "org.sqlite.JDBC";
//        try {
//            Class.forName(nomDriver);
//        } catch (ClassNotFoundException e) {
//            System.err.println("No es pot carregar el driver");
// 

//Formar l'URL per connectar a la base de dades
        String nomBaseDades = "empresa.sqlite";
        String jdbc = "jdbc:sqlite";
        String urlJDBC = jdbc + ":" + nomBaseDades;
        // jdbc:sqlite:empresa.sqlite          
// Crear la connexió a la base de dades
        try {
            conn = DriverManager.getConnection(urlJDBC);
        } catch (SQLException e) {
            System.err.println("No es pot connectar a la bbdd");
        }



//Provar Preparedstatement
//Ex1
//        try {
//            String sql = "INSERT INTO departaments VALUES (?,?,?)";
//            pre = conn.prepareStatement(sql);
//            
//            
//            String nomDep = "Community Managing";
//            String nomCiutat = "Barcelona";
//            int nd=44;
//            pre.setInt(1, nd);
//            pre.setString(2, nomDep);
//            pre.setString(3, nomCiutat);
//            pre.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("Problemes amb SQL");
//            System.out.println(e);
//        }


//Ex2
//            String sql="UPDATE empleats SET salari = salari + ? WHERE num_dep=?";
//            String sql2="INSERT into EMPLEATS VALUES (8,'Paco','23/06/2014',2000,88)";
//            try{
//            pre=conn.prepareStatement(sql);
//            double extra=500;
//            int numDep=5;
//            pre.setDouble(1,extra);
//            pre.setInt(2, numDep);
//            pre.executeUpdate();
//            }catch(SQLException e){
//                System.out.println(e);
//            }

//Ex3
            String sql="SELECT nom_emp, salari FROM empleats WHERE num_dep=?";
            
            try{
            pre=conn.prepareStatement(sql);
            int numDep=1;
            pre.setInt(1, numDep);
            
            rs = pre.executeQuery();
            while(rs.next()){
                System.out.print(rs.getString("nom_emp")+" ");
                System.out.println(rs.getDouble("salari"));
            }
            }catch(SQLException e){
                System.out.println(e);
            }
            
        try {
           // rs.close();
            pre.close();
            conn.close();
        } catch (SQLException e) {
            System.err.println("Problemes amb close()");
        }
        

        
    }
}