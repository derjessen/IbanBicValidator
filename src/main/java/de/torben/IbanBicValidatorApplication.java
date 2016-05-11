package de.torben;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class IbanBicValidatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbanBicValidatorApplication.class, args);
        System.out.println("Gestartet");
    }
}
