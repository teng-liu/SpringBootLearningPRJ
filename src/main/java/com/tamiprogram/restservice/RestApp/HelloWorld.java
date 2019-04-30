package com.tamiprogram.restservice.RestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation
@RestController
public class HelloWorld {

    @Autowired
    @Qualifier("fancyWriter")
    TextWriter writerFancy;

    @Autowired
    @Qualifier("regularWriter")
    TextWriter writerRegular;

//    public HelloWorld(FancyWriter text) {
//        this.writer = text;
//    }


    @RequestMapping("/")
    public String index(){
        // return "Hello World";
        return writerRegular.writeText("Hello Tami!");
    }

    @RequestMapping("/tami")
    public String tami(){
        // return "Hello World";
        return writerFancy.writeText("welcome to Tami page .../tami!");
    }
}
