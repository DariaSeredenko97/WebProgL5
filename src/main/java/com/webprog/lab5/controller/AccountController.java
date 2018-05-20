package com.webprog.lab5.controller;

import com.webprog.lab5.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public final class AccountController {

    private final UserService userService;

    @GetMapping("account/{id}")
    public ModelAndView index(@PathVariable("id") String id) {
        return new ModelAndView("account", "user", userService.get(id));
    }

}
