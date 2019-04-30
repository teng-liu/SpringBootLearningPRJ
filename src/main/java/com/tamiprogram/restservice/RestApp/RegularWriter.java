package com.tamiprogram.restservice.RestApp;

import org.springframework.stereotype.Component;

@Component
public class RegularWriter implements TextWriter{
    public String writeText(String text) {
        return text.toUpperCase();
    }
}
