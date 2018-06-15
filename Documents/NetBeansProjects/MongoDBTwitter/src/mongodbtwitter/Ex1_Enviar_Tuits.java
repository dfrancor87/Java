package mongodbtwitter;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import twitter4j.DirectMessage;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Danny Franco
 */
public class Ex1_Enviar_Tuits {

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
            // consultar los Tuits de un usuario   
            //List<Status> statuses = twitter.getUserTimeline("danferfra"); //tuits del use "unicef_es"   
            //System.out.println("Els tuits ");

            // guardar los tuits de un usuario en la base de datos 
//            for (Status tuit : statuses) {
//                System.out.println(tuit);
//                System.out.println("----------------------------------");
////                System.out.println(cont +" "+status.getUser().getId()+" "+status.getUser().getName() + ":"
////                        + status.getText());
//                Tuit aux = new Tuit(tuit.getText(), tuit.getId(), tuit.getCreatedAt());
//                usus.insertOne(aux.toDocument());
//            }
//            mongo.close();
            // tuitear
            // Status tweetEscrito = twitter.updateStatus("Este tweet ha sido mandado desde el manual de https://suarezdeveloper.wordpress.com/2012/04/12/como-twittear-con-java/ #SuarezDeveloperTwitter"); 
            // mensaje directo
//            String userTwiter = "danferfra";
//            String mensaje = "Este es un mensaje enviado desde Netbeans";
//            DirectMessage directMessage = twitter.sendDirectMessage(userTwiter, mensaje);
            ResponseList<Location> locations;
            locations = twitter.getAvailableTrends();
            System.out.println("Showing available trends");
            for (Location location : locations) {
                System.out.println(location.getName() + " (woeid:" + location.getWoeid() + ")");
            }
            System.out.println("una ciudad"+ locations.get(1));
            
        } catch (TwitterException e) {
            System.out.println("Problemes...");
            System.out.println(e);
        }

    }

}
