package com.dd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String hello() {
        return "HelloWorld";
    }

    // Write your api calls here
}
