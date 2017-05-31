package com.uchoice.springcloud.registry;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by levou on 2017/5/13.
 */
@SpringBootApplication
@EnableEurekaServer
public class UchoiceRegistryEurekaApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(UchoiceRegistryEurekaApplication.class).web(true).run(args);
    }
}
