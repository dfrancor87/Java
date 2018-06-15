/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongodbtwitter;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Danny Franco
 */
public class Consultas {

    public static void main(String[] args) {
        //connexió a mongodb
        MongoClient mongo = new MongoClient();
        MongoDatabase db = mongo.getDatabase("bd_tendencias");
        //si no existeix la database, la crea
        MongoCollection usus = db.getCollection("tendencias");
        //llistar tots els documents
        FindIterable<Document> it = usus.find();
        for (Document aux : it) {
            TrendingTopics tren = new TrendingTopics(aux);
            System.out.println("Ciudad: " + tren.getCiudad());
            System.out.println("Tendencia: " + tren.getTendencia());
            System.out.println("Fecha: " + tren.getData());
            System.out.println("\n");

            //   System.out.println("doc="+d);
        }
    }
}
