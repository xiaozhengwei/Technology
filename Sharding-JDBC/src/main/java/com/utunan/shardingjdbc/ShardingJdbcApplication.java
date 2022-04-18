package com.utunan.shardingjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ShardingJdbcApplication.class, args);
        Environment environment = applicationContext.getEnvironment();
        String port = environment.getProperty("server.port");
        String path = environment.getProperty("server.servlet.context-path");
        System.out.println("\n----------------------------------------------------------\n\t" +
                "Application is running! Access URLs:\n\t" +
                "swagger-ui: \thttp://localhost:" + port + path + "/swagger-ui.html\n\t" +
                "----------------------------------------------------------");
    }

}
