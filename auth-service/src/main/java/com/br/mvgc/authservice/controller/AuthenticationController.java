package com.br.mvgc.authservice.controller;

import com.br.mvgc.authservice.model.UserDTO;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Authentication endpoint
 *
 */
@RestController
public class AuthenticationController {

    @PostMapping("/authenticate")
    @ResponseBody
    public UserDTO authenticate(Authentication authentication) {
        return new UserDTO(authentication.getName(), authentication.getAuthorities());
    }

}
