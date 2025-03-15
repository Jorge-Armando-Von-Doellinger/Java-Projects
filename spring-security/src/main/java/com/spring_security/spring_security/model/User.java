package com.spring_security.spring_security.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.jdbc.core.SqlReturnType;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_database")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "tab_user_roles", joinColumns = @JoinColumn(name = "user_roles"))
    @Column(name = "role_id")
    private List<String> roles = new ArrayList<>();

    public User() {

    }
    public User(String username){
        this.username = username;
    }
}
