package com.tamiprogram.restservice.RestApp;

import org.springframework.stereotype.Component;

@Component
public class FancyWriter implements TextWriter{

    public String writeText(String text) {
        return text + " [ in FancyWrite Style ]";
    }
}
