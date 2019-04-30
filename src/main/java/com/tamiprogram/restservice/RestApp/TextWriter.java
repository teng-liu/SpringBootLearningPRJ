package com.tamiprogram.restservice.RestApp;

import org.springframework.stereotype.Component;

@Component
public interface TextWriter {
    public String writeText(String text);
}
