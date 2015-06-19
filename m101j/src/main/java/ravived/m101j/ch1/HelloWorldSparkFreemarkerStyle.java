package ravived.m101j.ch1;

import freemarker.template.Configuration;
import freemarker.template.Template;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rved on 19/06/15.
 */
public class HelloWorldSparkFreemarkerStyle {

    public static void main(String[] args) {

        final Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HelloWorldSparkFreemarkerStyle.class, "/");


        Spark.get("/", (request, response) -> {
            StringWriter stringWriter = new StringWriter();
            try {
                Template helloTemplate = configuration.getTemplate("hello.ftl");


                Map<String, Object> helloMap = new HashMap<String, Object>();
                helloMap.put("name", "Freemarker !");

                helloTemplate.process(helloMap, stringWriter);

                System.out.println(stringWriter.toString());


            } catch (Exception e) {
                Spark.halt(500);
                e.printStackTrace();
            } finally {
            }
            return stringWriter;

        });


    }
}
