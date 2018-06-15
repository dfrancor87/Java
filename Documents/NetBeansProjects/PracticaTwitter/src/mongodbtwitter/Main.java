package mongodbtwitter;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import twitter4j.ResponseList;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Danny Franco
 */
public class Main {

    public static void main(String[] args) {
        //connexió a mongodb
        MongoClient mongo = new MongoClient();
        MongoDatabase db = mongo.getDatabase("bd_tendencias");
        //si no existeix la database, la crea
        MongoCollection mongoCol = db.getCollection("tendencias");
        //connexió twitter
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("htXFBXrCBlkdQoJIY0H3qoJpv")
                .setOAuthConsumerSecret("7GcXjHZsK3Iuhgl1PQxbrLcwxNty0K2aXxjFZ1dduPmLp7bIPJ")
                .setOAuthAccessToken("395910091-j80hcTQk0JsYnhQ2jVVVOrl9MMDBhgAvXtB33yBB")
                .setOAuthAccessTokenSecret("WlgvclPPDBD60t4kKzBegplZY3F50Qqu7QdCNOWKjsz3E");

        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        /*
	Barcelona Spain	753692	
	Bilbao	Spain	754542	
	Las Palmas Spain 764814	
	Madrid	Spain	766273	
	Malaga	Spain	766356		
	Murcia	Spain	768026	
	Palma	Spain	769293	
	Seville	Spain	774508	
	Valencia Spain	776688	
	Zaragoza Spain	779063	
         */
        try {
            Trends trends = twitter.getPlaceTrends(753692);
            
            for (int i = 0; i < trends.getTrends().length; i++) {
                // tendencia
                String tendencia = trends.getTrends()[i].getName();
                //ciudad
                String ciudad = trends.getLocation().getName();
                // url
                String url = trends.getTrends()[i].getURL();

                TrendingTopics aux = new TrendingTopics(ciudad, tendencia, url, trends.getAsOf()) {
                };
                System.out.println(aux);
                mongoCol.insertOne(aux.toDocument());

                //fecha
                //System.out.println("fecha1 " + trends.getAsOf());
//                System.out.println("fecha2 " + trends.getTrendAt());
            }
            mongo.close();
        } catch (TwitterException e) {
            System.out.println("Error " + e);
        }

    }

}
