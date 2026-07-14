package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.response.UserResponseDto;
import com.SpringBoot.BusReservationSystem.enums.Role;
import com.SpringBoot.BusReservationSystem.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public static User mapDtoToEntity(
            String fullName,
            String email,
            String password,
            Role role
    ) {

        User user = new User();

        user.setFullName(fullName);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role);

        return user;
    }

    public UserResponseDto mapEntityToDto(User user){
        UserResponseDto dto = new UserResponseDto(
                user.getFullName(),
                user.getEmail(),
                user.getRole(),
                user.getUserStatus()
        );
        return dto;
    }
}
