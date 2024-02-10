package com.myblog.myblog1.payload;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;

    public Object getUsernameOrEmail() {
        return usernameOrEmail;
    }

    public Object getPassword() {
        return password;
    }
}

