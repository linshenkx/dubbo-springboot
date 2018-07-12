package com.linshen.dubbo.provider;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {

//        EmbeddedZooKeeper zooKeeper= new EmbeddedZooKeeper(2181, false);
//        zooKeeper.start();
//        System.out.println("zooKeeper.isRunning(): "+zooKeeper.isRunning());
        new SpringApplicationBuilder(ProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
