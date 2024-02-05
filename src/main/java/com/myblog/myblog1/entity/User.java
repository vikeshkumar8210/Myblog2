package com.myblog.myblog1.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"username"}),
        @UniqueConstraint(columnNames = {"email"})
})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String username;
    private String email;
    private String password;

    public void setName(Object name) {
    }

    public void setUsername(String username) {
    }

    public void setEmail(String email) {
    }

    public void setPassword(String encode) {
    }
}
