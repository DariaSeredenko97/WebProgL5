package com.webprog.lab5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public final class WelcomeController {

    @RequestMapping("/")
    private ModelAndView welcome() {
        return new ModelAndView("welcome");
    }

}
