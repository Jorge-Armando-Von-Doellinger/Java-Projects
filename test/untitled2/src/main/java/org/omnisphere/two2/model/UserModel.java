package org.omnisphere.two2.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserModel {
    private int id;
    private String name;
    private LocalDate birthDay;
}
