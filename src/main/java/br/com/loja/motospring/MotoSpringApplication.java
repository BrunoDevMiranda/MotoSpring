package br.com.loja.motospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan
public class MotoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MotoSpringApplication.class, args);
    }

}
