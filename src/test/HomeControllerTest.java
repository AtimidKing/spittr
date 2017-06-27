package test;

import org.springframework.test.web.servlet.MockMvc;
import webtest.controller.HomeController;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by king on 2017/6/27.
 */
public class HomeControllerTest {
    @org.junit.Test
    public void home() throws Exception {
        HomeController homeController=new HomeController();
        MockMvc mockMvc=standaloneSetup(homeController).build();
        mockMvc.perform(get("/homePage")).andExpect(view().name("home"));
//        assertEquals("home",homeController.home());
    }

}