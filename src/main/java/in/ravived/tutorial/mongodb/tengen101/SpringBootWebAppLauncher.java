package in.ravived.tutorial.mongodb.tengen101;

import in.ravived.tutorial.mongodb.tengen101.controller.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by rved on 13/06/15.
 *
 * https://spring.io/guides/gs/spring-boot/#scratch
 *
 * https://spring.io/guides/gs/handling-form-submission/
 *
 */
@SpringBootApplication
public class SpringBootWebAppLauncher {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringBootWebAppLauncher.class, args);

        // ApplicationContext ctx = SpringApplication.run(GreetingController.class, args);


//        System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//        String[] beanNames = ctx.getBeanDefinitionNames();
//
//        Arrays.sort(beanNames);
//
//        for (String beanName : beanNames) {
//
//            System.out.println(beanName);
//
//        }

    }
}



