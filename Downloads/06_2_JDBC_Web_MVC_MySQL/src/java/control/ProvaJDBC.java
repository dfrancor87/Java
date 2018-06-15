package control;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author Prof1
 */
public class ProvaJDBC {
public static void main(String[] args) {
        //Variables-objectes a utilitzar    
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
           
            
            //DriverManager.getConnection("jdbc:mysql://hostname:port/dbname","username", "password");

String nomDriver="com.mysql.jdbc.Driver";
Class.forName("com.mysql.jdbc.Driver"); //en principi, desde jdk 6 no cal

            //:3306
//            Context context = new InitialContext();
//DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/myDB");
//        
////MysqlDataSource dataSource=new MysqlDataSource();
//            dataSource.setUser("root");
//            dataSource.setPassword("1234");
//            
//            conn=dataSource.getConnection();
           
            //bd_proves es el nom de la connection de mysql (establerta al mysql workbench)
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proves","root","");
             
             stmt=conn.createStatement();
            //int, varchar(45), double, tinyint
            String ferInsert = "insert into taula_proves values(6, 'Tablet', 120, 1)";
           // stmt.executeUpdate(ferInsert);
            String ferSelect = "SELECT * FROM taula_proves";
            rs = stmt.executeQuery(ferSelect);           
            while (rs.next()) {
                int num = rs.getInt("numero");
                System.out.print("Numero=" + num + " ");
                String nom = rs.getString("nom");
                System.out.println("Nom=" + nom);
                double preu=rs.getDouble("preu");
                System.out.println("Preu = "+preu);
                int necessari=rs.getInt("necessari");
                System.out.println("necessari ="+necessari);
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
