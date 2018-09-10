package com.java.controller;

import com.java.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
public class WebControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
       mockMvc =  MockMvcBuilders.standaloneSetup(new WebControllerTest()).build();
    }

    @Test
    public void getUser()throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/saveUserInfo")
                .param("name","").param("age","13")).andDo(print());
    }
}
