package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author montse
 * @version març 2017
 */
public class AccesBeanProva {

    private Connection con;
    private Statement sentencia;
//Una altra manera d'accedir
//    #mysql DB properties
//MYSQL_DB_DRIVER_CLASS=com.mysql.jdbc.Driver
//MYSQL_DB_URL=jdbc:mysql://localhost:3306/bd_proves
//MYSQL_DB_USERNAME=root
//MYSQL_DB_PASSWORD=1234
    
    
    
    public AccesBeanProva() throws Exception {

        Class.forName("com.mysql.jdbc.Driver"); 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_proves?useUnicode=yes&characterEncoding=UTF-8", "root", "");
        sentencia = con.createStatement();
    }

    public void inserirBeanProva(BeanProva bp) throws Exception {
        int num = bp.getNumero();
        double preu = bp.getPreu();
        //a MySQL es guarda un INT 0=false, 1=true
        int necessari = bp.isNecessari() ? 1 : 0;
        String nom = bp.getNom();
        sentencia.executeQuery("SET NAMES 'UTF8'");
    sentencia.executeQuery("SET CHARACTER SET 'UTF8'");
        //ordre a la taula de mysql: numero nom preu necessari
        sentencia.executeUpdate("insert into taula_proves values(" + num + ",'" + nom + "'," + preu + "," + necessari + ")");
    }

    public ArrayList<BeanProva> llistarBeanProva() throws Exception {
        ResultSet rs = sentencia.executeQuery("select * from taula_proves");
        //System.out.println("---------------------");
        ArrayList<BeanProva> l = new ArrayList();
        while (rs.next()) {
            BeanProva bp = new BeanProva();
             String n = rs.getString("nom");
            //String n = new String(rs.getBytes("nom"), "UTF-8");
            int id = rs.getInt("numero");
            double preu = rs.getDouble("preu");
            int necessari = rs.getInt("necessari");
            bp.setNumero(id);
            bp.setNom(n);
            bp.setPreu(preu);
            bp.setNecessari(necessari == 1);
            l.add(bp);
        }
        return l;
    }
}
