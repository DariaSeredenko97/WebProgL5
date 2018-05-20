package com.webprog.lab5.controller;

import com.webprog.lab5.model.User;
import com.webprog.lab5.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public final class RegistrationController {

    private static final String STORAGE = "C:\\Users\\Дарья\\IdeaProjects\\WebProgL5\\src\\main\\webapp";

    private final UserService userService;

    @GetMapping("registration")
    public ModelAndView index() {
        return new ModelAndView("registration", "user", new User());
    }

    @PostMapping("registration")
    public String index(final User user, @RequestParam("file") final MultipartFile multipart) throws IOException {
        val relativePath = '/' + user.getUsername() + '_' + UUID.randomUUID().toString() + ".jpg";
        val imagePath = STORAGE + relativePath;
        val imageFile = new File(imagePath);
        if (imageFile.createNewFile()) {
            multipart.transferTo(imageFile);
            user.setImagePath(relativePath);
        }

        val id = UUID.randomUUID().toString();
        user.setId(id);
        userService.create(user);

        return "redirect:account/" + id;
    }

}
