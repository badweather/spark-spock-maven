/**
 * Created by Brent Weatherall on 2/22/14.
 */

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;

public class Spark {
    public static void main(String[] args) {
        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });
    }
}
