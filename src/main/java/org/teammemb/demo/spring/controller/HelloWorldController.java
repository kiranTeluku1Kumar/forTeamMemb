package org.teammemb.demo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController { 

    @RequestMapping("/hello")
    public ModelAndView hello(Model model) {
    	
    	ModelAndView mv;    	
    	mv = new ModelAndView("helloworld");	
    	
    	String team = "Histogenetics!!";
    	String name = "sungkook seo";
    	
    	mv.addObject("name", name);
    	mv.addObject("team", team);
    	
    	return mv;
    	
        //model.addAttribute("name", name);
        //return "helloworld";
    }

}
