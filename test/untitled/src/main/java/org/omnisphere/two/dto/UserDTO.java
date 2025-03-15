package org.omnisphere.two.dto;



import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {
    private int id;
    private String name;
    private LocalDate dateBirth;
}
