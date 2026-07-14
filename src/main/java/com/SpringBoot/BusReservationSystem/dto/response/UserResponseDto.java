package com.SpringBoot.BusReservationSystem.dto.response;

import com.SpringBoot.BusReservationSystem.enums.Role;
import com.SpringBoot.BusReservationSystem.enums.Status;


public record UserResponseDto(
        String fullName,
        String email,
        Role role,
        Status userStatus
) {
}
