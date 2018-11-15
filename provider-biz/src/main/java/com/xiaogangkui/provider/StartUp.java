package com.xiaogangkui.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Created by luchunyu
 */
@SpringBootApplication
@ComponentScan(value = {"com.xiaogangkui.provider"})
public class StartUp {
    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }
}
