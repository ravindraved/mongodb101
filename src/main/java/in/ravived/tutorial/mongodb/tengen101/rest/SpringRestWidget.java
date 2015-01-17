package in.ravived.tutorial.mongodb.tengen101.rest;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rved on 16/01/15.
 */

@RequestMapping("/api/**")
@RestController
public class SpringRestWidget {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getValue() {

        return "Hello";

    }

}
