package com.SpringBoot.BusReservationSystem.dto.response;

import com.SpringBoot.BusReservationSystem.enums.Role;


public record UserResponseDto(
        String fullName,
        String email,
        Role role,
        UserStatus userStatus
) {
}
