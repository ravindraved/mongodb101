package in.ravived.tutorial.mongodb.tengen101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rved on 16/01/15.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class HelloSpringBoot {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBoot.class, args);


    }
}
