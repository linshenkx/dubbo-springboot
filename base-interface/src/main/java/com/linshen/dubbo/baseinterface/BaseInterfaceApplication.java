package com.linshen.dubbo.baseinterface;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BaseInterfaceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BaseInterfaceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
