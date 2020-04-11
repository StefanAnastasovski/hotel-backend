package com.mk.stefan.hotel.controllers;

import com.mk.stefan.hotel.repositories.SignUpRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {

    private final SignUpRepository signUpRepository;

    public SignUpController(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

    @RequestMapping("/signup")
    public  String getUsername(Model model){

        model.addAttribute("signup", signUpRepository.findAll());

        return "signuplist";
    }
}
