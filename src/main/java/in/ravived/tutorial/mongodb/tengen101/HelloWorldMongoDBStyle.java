package in.ravived.tutorial.mongodb.tengen101;

import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * Created by rved on 13/01/15.
 */
public class HelloWorldMongoDBStyle {

    public HelloWorldMongoDBStyle() {
    }

    public static void main(String[] args) throws UnknownHostException {
        try {
            MongoClient client = new MongoClient(new ServerAddress("localhost", 27017));
            DB database = client.getDB("ravidb");

            DBCollection collection = database.getCollection("users");

            DBObject document = collection.findOne();
            System.out.println(document);
        } finally {

        }


    }

}
