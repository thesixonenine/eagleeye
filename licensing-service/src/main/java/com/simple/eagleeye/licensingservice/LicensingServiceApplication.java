package com.simple.eagleeye.licensingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author simple
 */
@EnableEurekaClient
@SpringBootApplication
@RefreshScope
public class LicensingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LicensingServiceApplication.class, args);
//        Scanner scanner = new Scanner(System.in);
//        String port = scanner.nextLine();
//        new SpringApplicationBuilder(LicensingServiceApplication.class).properties("server.port=" + port).run(args);
    }
}
