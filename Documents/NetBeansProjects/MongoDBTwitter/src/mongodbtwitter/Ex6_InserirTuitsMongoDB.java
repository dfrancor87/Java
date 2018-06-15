package mongodbtwitter;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/** Com inserir objectes a una base de dades MongoDB. Driver 3
 * JDK 7
 *
 * @author montse
 * @version abril 2016
 */
public class Ex6_InserirTuitsMongoDB {
    
    public static void main(String[] args) {
        //connexió a mongodb
        MongoClient mongo = new MongoClient();
        MongoDatabase db = mongo.getDatabase("bd_tuits2018");
        //si no existeix la database, la crea
        MongoCollection usus = db.getCollection("tuits");
        //connexió twitter
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
		//cal canviar pels passwords propis
                .setOAuthConsumerKey("htXFBXrCBlkdQoJIY0H3qoJpv")
                .setOAuthConsumerSecret("7GcXjHZsK3Iuhgl1PQxbrLcwxNty0K2aXxjFZ1dduPmLp7bIPJ")
                .setOAuthAccessToken("395910091-j80hcTQk0JsYnhQ2jVVVOrl9MMDBhgAvXtB33yBB")
                .setOAuthAccessTokenSecret("WlgvclPPDBD60t4kKzBegplZY3F50Qqu7QdCNOWKjsz3E");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        
        try {
            List<Status> statuses = twitter.getUserTimeline("CSEmelec"); //tuits del use "unicef_es"   
            System.out.println("Els tuits ");
            
            for (Status tuit : statuses) {
                System.out.println(tuit);
                System.out.println("----------------------------------");
//                System.out.println(cont +" "+status.getUser().getId()+" "+status.getUser().getName() + ":"
//                        + status.getText());
                Tuit aux = new Tuit(tuit.getText(), tuit.getId(), tuit.getCreatedAt());
                usus.insertOne(aux.toDocument());
            }
            mongo.close();
        } catch (TwitterException e) {
            System.out.println("Problemes...");
            System.out.println(e);
        }
    }
}
