package ravived.m101j.ch1;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rved on 17/06/15.
 */

public class HelloWorldFreemarker {
    public static void main(String[] args) {
        //in start of classpath of HelloWorldFreemarker is whre u find html
        //define template in resources directory-- maven and intellij know to include this in classpath
        //configure Freemarker

        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(HelloWorldFreemarker.class, "/");

        try {
            Template helloTemplate = configuration.getTemplate("hello.ftl");

            StringWriter stringWriter = new StringWriter();
            Map<String, Object> helloMap = new HashMap<String, Object>();
            helloMap.put("name", "Freemarker !");

            helloTemplate.process(helloMap, stringWriter);

            System.out.println(stringWriter.toString());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }


}
