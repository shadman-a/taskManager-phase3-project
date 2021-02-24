package com.hcl.taskmanager.controllers;

import com.hcl.taskmanager.models.User;
import com.hcl.taskmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SignupController {

    @Autowired
    UserService service;

    @GetMapping("/signup")
    public String signUpPage() {
        return "signup";
    }

    @PostMapping("/signup")
    public RedirectView postSignUpPage(User user) {
        service.addUser(user);
        return new RedirectView("display-tasks");
    }
}
