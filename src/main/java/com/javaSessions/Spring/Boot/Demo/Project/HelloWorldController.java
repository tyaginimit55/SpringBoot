package com.javaSessions.Spring.Boot.Demo.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String  hello(){
        return  " Hello World Spring";
    }

}
