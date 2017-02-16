package com.helloworld.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Administrator on 2017/2/15.
 */
@SpringBootApplication
@EnableTransactionManagement
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
