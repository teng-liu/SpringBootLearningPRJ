package com.tamiprogram.restservice.RestApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.data.rest.core.event.ExceptionEvent;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;


import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloWorld.class)
@ContextConfiguration(classes = {FancyWriter.class, HelloWorld.class, RegularWriter.class})
public class HelloWorldTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testIndex() throws Exception {
        String pass = "HELLO TAMI!";
        MvcResult result = this.mockMvc.perform(get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        assertEquals(result.getResponse().getContentAsString(), pass);
    }

    @Test
    public void testTami() throws Exception{
        String pass1 = "welcome to Tami page .../tami! [ in FancyWrite Style ]";
        MvcResult result1 = this.mockMvc.perform(get("/tami"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        assertEquals(result1.getResponse().getContentAsString(), pass1);
    }
}