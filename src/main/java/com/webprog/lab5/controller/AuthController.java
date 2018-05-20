package com.webprog.lab5.controller;

import com.webprog.lab5.domain.AuthModel;
import com.webprog.lab5.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public final class AuthController {

    private final UserService userService;

    @GetMapping("auth")
    public ModelAndView index() {
        return new ModelAndView("auth", "authModel", new AuthModel());
    }

    @PostMapping("auth")
    public String index(final AuthModel authModel, final BindingResult result) {
        val id = userService.auth(authModel.getUsername(), authModel.getPassword());
        if (id == null) {
            result.addError(new ObjectError("auth", "Не удалось найти пользователя с такими логином и паролем"));
            return "redirect:auth";
        }

        return "redirect:account/" + id;
    }

}
