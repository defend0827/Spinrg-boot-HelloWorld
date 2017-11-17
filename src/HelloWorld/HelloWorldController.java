package HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot HelloWorld°¸Àý
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {
 
    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }
}