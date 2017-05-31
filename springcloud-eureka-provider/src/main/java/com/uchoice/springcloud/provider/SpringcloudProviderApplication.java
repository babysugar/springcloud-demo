package com.uchoice.springcloud.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by ${admin} on 2017/5/31.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudProviderApplication {
    public static void main(String[] args){
        new SpringApplicationBuilder(SpringcloudProviderApplication.class).web(true).run(args);
    }
}
