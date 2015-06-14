package in.ravived.tutorial.mongodb.tengen101.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rved on 14/06/15.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "hell from spring boot";
    }

}
