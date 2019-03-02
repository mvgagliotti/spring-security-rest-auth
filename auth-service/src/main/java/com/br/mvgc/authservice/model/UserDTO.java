package com.br.mvgc.authservice.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import java.util.Collection;

@Data
public class UserDTO {

    private final String username;
    private final Collection<? extends GrantedAuthority> authorities;

    public UserDTO(String username, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.authorities = authorities;
    }
}
