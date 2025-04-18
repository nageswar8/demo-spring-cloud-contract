package com.sampleAI.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallController {


    @GetMapping("just/{str}")
    public String justCall(@PathVariable String str) {
        return "Hey this is your code bro : "+str;
    }
}
