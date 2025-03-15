package org.omnisphere.two2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.omnisphere.two2.dto.UserDTO;
import org.omnisphere.two2.model.UserModel;

@Mapper
public interface UserMapper {
    @Mapping(source = "id", target = "id")
    UserModel toModel(final UserDTO dto);
    UserDTO toDto(final UserModel model);
}
