package hello;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/smart")
    String smart(){
        return "Hey Smart";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
