package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/helloSpringBoot")
    @ResponseBody
    public String helloSpringBoot(){
        return "helloSpringBoot";
    }
}
