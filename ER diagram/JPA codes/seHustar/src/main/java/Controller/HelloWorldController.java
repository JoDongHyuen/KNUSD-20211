package Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hello(){
        System.out.println("helloWorld Controller 응답");
        return "Hello World, from Spring Boot 2!";
    }
}
