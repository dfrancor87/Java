package mongodbtwitter;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import twitter4j.Location;
import twitter4j.ResponseList;
import twitter4j.Trends;
import twitter4j.Trend;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Danny Franco
 */
public class PruebaTrend {

    public static void main(String[] args) {
        //connexió a mongodb
        MongoClient mongo = new MongoClient();
        MongoDatabase db = mongo.getDatabase("bd_trends");
        //si no existeix la database, la crea
        MongoCollection mongoCol = db.getCollection("trend");
        //connexió twitter
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("htXFBXrCBlkdQoJIY0H3qoJpv")
                .setOAuthConsumerSecret("7GcXjHZsK3Iuhgl1PQxbrLcwxNty0K2aXxjFZ1dduPmLp7bIPJ")
                .setOAuthAccessToken("395910091-j80hcTQk0JsYnhQ2jVVVOrl9MMDBhgAvXtB33yBB")
                .setOAuthAccessTokenSecret("WlgvclPPDBD60t4kKzBegplZY3F50Qqu7QdCNOWKjsz3E");

         TwitterFactory tf = new TwitterFactory(cb.build());
          Twitter twitter = tf.getInstance();
        try {
//            ResponseList<Location> locations;
//            locations = twitter.getAvailableTrends();
//            int idTrendLocation = 753692;
//            
//            Trends trends = twitter.getPlaceTrends(idTrendLocation);
//            System.out.println("*** "+trends);
//            for (int i = 0; i < trends.getTrends().length; i++) {
//              //  System.out.println(i + " " + trends.getTrends()[i]);
//                  System.out.println(trends.getTrends()[i].getAsof());
//              //Trend aux = new Trend(trends.getTrends()[i].getName(), tuit.getId(), tuit.getCreatedAt());
//            }
//            Trends trends = twitter.getPlaceTrends(753692);
//            for (int i = 0; i < trends.getTrends().length; i++) {
//                System.out.println(trends.getTrends()[i].getName());
//            }

	List <Trends> trends = (List <Trends>) twitter.getPlaceTrends(753692);
        
//        for (int i = 0; i < trends.getTrends().length; i++) {
//        System.out.println(trends.getTrends()[i]);
       // Trends aux = new Trends(trends.getLocation(), tuit.getId(), tuit.getCreatedAt()) {};
        //      mongoCol.insertOne(trends.toDocument());
        for (Trends trend : trends) {
                            System.out.println("----------------------------------");
                System.out.println(trend);

//                System.out.println(trend.);
//                //ciudad   
//                System.out.println(trends.getLocation().getName());
//                // url
//                System.out.println(trends.getTrends()[i].getURL());
//                //fecha
//                System.out.println("fecha1 " + trends.getAsOf());
//                System.out.println("fecha2 " + trends.getTrendAt());
               
             //   Tuit aux = new Tuit(tuit.getText(), tuit.getId(), tuit.getCreatedAt());
              //  usus.insertOne(aux.toDocument());
            }
        

         
         
//         List<Status> statuses = twitter.getUserTimeline("CSEmelec"); //tuits del use "unicef_es"   
//            System.out.println("Els tuits ");
//            
//            for (Status tuit : statuses) {
//                System.out.println(tuit);
//                System.out.println("----------------------------------");
////                System.out.println(cont +" "+status.getUser().getId()+" "+status.getUser().getName() + ":"
////                        + status.getText());
//                Tuit aux = new Tuit(tuit.getText(), tuit.getId(), tuit.getCreatedAt());
//                mongoCol.insertOne(aux.toDocument());
//            }
//            mongo.close();
         

        } catch (TwitterException e) {
            System.out.println("Problemes...");
            System.out.println(e);
        }

    }

    private static Integer getTrendLocationId(String locationName) {

        int idTrendLocation = 0;

        try {

            ConfigurationBuilder cb = new ConfigurationBuilder();
            cb.setDebugEnabled(true)
                    //cal canviar pels passwords propis
                    .setOAuthConsumerKey("htXFBXrCBlkdQoJIY0H3qoJpv")
                    .setOAuthConsumerSecret("7GcXjHZsK3Iuhgl1PQxbrLcwxNty0K2aXxjFZ1dduPmLp7bIPJ")
                    .setOAuthAccessToken("395910091-j80hcTQk0JsYnhQ2jVVVOrl9MMDBhgAvXtB33yBB")
                    .setOAuthAccessTokenSecret("WlgvclPPDBD60t4kKzBegplZY3F50Qqu7QdCNOWKjsz3E");

            TwitterFactory tf = new TwitterFactory(cb.build());
            Twitter twitter = tf.getInstance();

            ResponseList<Location> locations;
            locations = twitter.getAvailableTrends();

            for (Location location : locations) {
                if (location.getName().toLowerCase().equals(locationName.toLowerCase())) {
                    idTrendLocation = location.getWoeid();
                    break;
                }
            }

            if (idTrendLocation > 0) {
                return idTrendLocation;
            }

            return null;

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get trends: " + te.getMessage());
            return null;
        }

    }

}
