package org.teammemb.demo.spring.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@WebAppConfiguration
public class HelloWorldControllerTest {

    @Autowired private WebApplicationContext ctx;

    private MockMvc mockMvc;

    @Before public void setUp() {
        this.mockMvc = webAppContextSetup(ctx).build();
    }

    @Test public void helloWorld() throws Exception {
    	
        mockMvc.perform(get("/").contentType(MediaType.TEXT_PLAIN))
               .andExpect(status().isOk())
               .andExpect(forwardedUrl("helloworld"));

    }

    @Configuration
    public static class TestConfiguration {

        @Bean public HelloWorldController helloWorldController() {
            return new HelloWorldController();
        }

    }
}