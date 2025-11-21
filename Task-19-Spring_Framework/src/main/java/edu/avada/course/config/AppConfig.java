package edu.avada.course.config;

import edu.avada.course.model.SomeClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "edu.avada.course")
public class AppConfig {
    @Bean
    public SomeClass comeClass() {
        return new SomeClass();
    }
}
