package com.nguyendanghuy.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {
    @RequestMapping("/trang-chu")
    public String home(Model theModel){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.nguyendanghuy.controller");
        Person x = (Person)context.getBean("Person");
        theModel.addAttribute("person",x);
        return "trangChu";
    }
}
