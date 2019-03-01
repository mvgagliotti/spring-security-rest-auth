package com.br.mvgc.authservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

    @RequestMapping("/protected-by-user")
    public String checkUserIsProtected() {
        return "user is protected";
    }
}
