package com.omnisphere.streaming.omnisphere_streaming.Model;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
@Table(name = "UsersBB")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "_id")
    private Integer id;
    @Setter
    private String name;
    @Setter
    private String description;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
