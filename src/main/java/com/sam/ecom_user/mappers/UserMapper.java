package com.sam.ecom_user.mappers;

import com.sam.ecom_user.domain.UserEntity;
import com.sam.ecom_user.model.UserModel;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserEntity toEntity(UserModel userModel);
    UserModel toModel(UserEntity userEntity);
}
