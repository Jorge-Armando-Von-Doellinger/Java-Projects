package org.omnisphere.two;

import org.omnisphere.two.dto.UserDTO;
import org.omnisphere.two.model.UserModel;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        UserDTO dto = new UserDTO();
        var model = new UserModel();
        model.setCode(12);
        model.setBirthDay(LocalDate.now());
        model.setUserName("Basta!");
        dto.setName("asdw");
        System.out.println(dto.getName());
    }
}