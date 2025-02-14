package com.test.controller;

import com.test.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/application")
public class UserSignInController {
    @PostMapping("/signIn")
    public <T> ResponseEntity<String> userSignIn() {
        return new ResponseEntity<>("", HttpStatus.ACCEPTED);
    }


}
