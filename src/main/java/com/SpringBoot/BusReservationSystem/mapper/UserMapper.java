package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.UserRequestDto;
import com.SpringBoot.BusReservationSystem.dto.response.UserResponseDto;
import com.SpringBoot.BusReservationSystem.enums.Role;
import com.SpringBoot.BusReservationSystem.enums.UserStatus;
import com.SpringBoot.BusReservationSystem.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User mapDtoToEntity(UserRequestDto userRequestDto) {
        User user = new User();
        user.setFullName(userRequestDto.fullName());
        user.setEmail(userRequestDto.email());
        user.setPhoneNumber(userRequestDto.phoneNumber());
        user.setPassword(userRequestDto.password());
        user.setGender(userRequestDto.gender());
        user.setAddress(userRequestDto.address());

        user.setRole(Role.PASSENGER);
        user.setUserStatus(UserStatus.ACTIVE);

        return user;
    }
    public UserResponseDto mapEntityToDto(User user){
        UserResponseDto dto = new UserResponseDto(
                user.getFullName(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getGender(),
                user.getAddress(),
                user.getRole(),
                user.getUserStatus()
        );

        return dto;
    }
}
