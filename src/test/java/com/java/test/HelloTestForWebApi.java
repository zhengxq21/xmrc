package com.java.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
public class HelloTestForWebApi {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloTestForWebApi()).build();
    }

    @Test
    public void getHello()throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUserInfo").accept(MediaType.APPLICATION_JSON_UTF8)).andDo(print());
    }
}
