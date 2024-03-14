package stereotype_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigCourse {


    @Bean
   Selenium selenium(){
        return new Selenium();
    }

}
