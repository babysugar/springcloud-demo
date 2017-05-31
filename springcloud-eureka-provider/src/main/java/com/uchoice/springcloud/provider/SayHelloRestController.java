package com.uchoice.springcloud.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ${admin} on 2017/5/31.
 */
@RestController
@RequestMapping("test")
public class SayHelloRestController {
    @RequestMapping("/sayhello")
    public String sayHello(String input){
        return "say hello,your input is "+input;
    }
}
