package com.gjk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;
import org.springframework.context.ApplicationContext;

/**
 * Created by chaitu on 9/20/2015.
 */
@SpringBootApplication
public class GoIndiaApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(GoIndiaApplication.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}