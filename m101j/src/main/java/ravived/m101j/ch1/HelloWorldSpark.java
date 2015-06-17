package ravived.m101j.ch1;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import spark.Spark.*;

/**
 * Created by rved on 17/06/15.
 */
public class HelloWorldSpark {
    public static void main(String[] args) {

        Spark.get("/hello", (req, res) -> "Hello World");
    }
}
