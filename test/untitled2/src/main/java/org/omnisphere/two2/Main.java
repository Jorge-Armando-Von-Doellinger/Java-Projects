package org.omnisphere.two2;

import org.mapstruct.factory.Mappers;
import org.omnisphere.two2.dto.UserDTO;
import org.omnisphere.two2.mapper.UserMapper;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final UserMapper mapper = Mappers.getMapper(UserMapper.class);
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        var dto = new UserDTO();
        dto.setId(10);
        dto.setName("Batata");
        dto.setBirthDay(LocalDate.now());
        var obj = mapper.toModel(dto);
        System.out.println(obj.toString());
        System.out.println(mapper.toDto(obj).toString());
    }
}