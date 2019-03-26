package jp.co.yahoo.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        System.out.println("-- start! --");
        new SpringApplication(Application.class).run();
    }

}
