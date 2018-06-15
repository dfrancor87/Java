package mongodbtwitter;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Danny Franco
 */
public class OpcionB {

    public static void main(String[] args) {
        //connexió a mongodb
        MongoClient mongo = new MongoClient();
        MongoDatabase db = mongo.getDatabase("bd_hashtag");
        //si no existeix la database, la crea
        MongoCollection mongoCol = db.getCollection("hashtagDetails");
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
            Query query = new Query("#Emelec");
            //Query query = new Query("#Pasillo");
            //cantidad de tweets a devolver
            query.setCount(100);
            QueryResult result;
            result = twitter.search(query);
            List<Status> tweets = result.getTweets();
            for (Status tweet : tweets) {
                String hashtagFrase = tweet.getText();
                String usuario = '@' + tweet.getUser().getScreenName();
                Date fecha = tweet.getCreatedAt();
                String url = tweet.getUser().getURLEntity().getURL();

//                System.out.println(hashtagFrase);
//                System.out.println(usuario);
//                System.out.println(fecha);
                if (url == "") {
                    System.out.println("NO TIENE URL, NO GRABA EN BD" + url);
                    Info aux = new Info(hashtagFrase, usuario, fecha) {
                    };
                    mongoCol.insertOne(aux.toDocumentNotUrl());
                } else {
                    System.out.println(" URL-->" + url);
                    Info aux = new Info(hashtagFrase, usuario, fecha, url) {
                    };
                    mongoCol.insertOne(aux.toDocument());
                }

            }
            mongo.close();
        } catch (TwitterException e) {
            System.out.println("!!!!!ERROR" + e);

        }
    }
}
