package ravived.m101j.ch1;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import spark.Spark;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rved on 22/06/15.
 */
public class SparkFromHandling1 {

    public static void main(String[] args) {
        //configure Freemarker
        final Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(SparkFromHandling1.class, "/");

        //configure routes
        Spark.get("/", ((request, response) -> {

            Template fruitTemplate = configuration.getTemplate("fruitpicker.ftl");

            StringWriter stringWriter = new StringWriter();

            try {
                Map<String, Object> fruitMap = new HashMap<String, Object>();

                fruitMap.put("fruits",
                        Arrays.asList("apple", "orange", "banana", "mango"));

                fruitTemplate.process(fruitMap, stringWriter);

                System.out.println(stringWriter.toString());


                return stringWriter;

            } catch (TemplateException e) {
                e.printStackTrace();
                Spark.halt(500);

            } catch (IOException e) {

                e.printStackTrace();
                Spark.halt(500);
            } finally {
            }
            return null;


        }));


        Spark.post("/favorite_fruit", ((request, response) -> {
            String fruitSelected = request.queryParams("fruit");
            if (fruitSelected == null) {
                return "please select a fruit dear..";
            } else {
                return "great.. u selected " + fruitSelected + " .. that's your favorite one !";
            }

        }));


    }
}
