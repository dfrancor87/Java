package mongodbtwitter;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/** Consultar tuits previament introduits desde la classe
 *  InserirTuitsMongoDB. La bd es diu "bd_tuits" i la collection "tuits"
 * 
 * @author montse
 * @version abril 2016. MongoDB jdbc driver 3. JDK 7
 */
public class Ex7_ConsultarTuitsMongoDB {
    public static void main(String[] args) {
        //connexió a mongodb
        MongoClient mongo = new MongoClient();
        MongoDatabase db = mongo.getDatabase("bd_tuits");
        //si no existeix la database, la crea
        MongoCollection usus = db.getCollection("tuits");  
        //llistar tots els documents
            FindIterable<Document> it = usus.find();
            for (Document aux: it) {
                Tuit t=new Tuit(aux);
                System.out.println("tuit="+t);
             //   System.out.println("doc="+d);
            }
    }
}
