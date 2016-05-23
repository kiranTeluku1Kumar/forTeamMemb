package org.teammemb.demo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController { 

    @RequestMapping("/hello")
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
    	
    	//ModelAndView mv;    	
    	//mv = new ModelAndView("hello");	
    	
        model.addAttribute("name", name);
        return "helloworld";
    }

}
