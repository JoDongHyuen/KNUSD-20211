package Configuration;

import Controller.HelloWorldController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfiguration {
    @Bean
    public HelloWorldController helloWorldController(){
        return new HelloWorldController();
    }
}
