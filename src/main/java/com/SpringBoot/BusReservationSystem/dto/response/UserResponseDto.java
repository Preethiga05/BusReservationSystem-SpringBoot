package com.SpringBoot.BusReservationSystem.dto.response;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import com.SpringBoot.BusReservationSystem.enums.Role;
import com.SpringBoot.BusReservationSystem.enums.UserStatus;

public record UserResponseDto(
        String fullName,
        String email,
        String phoneNumber,
        Gender gender,
        String address,
        Role role,
        UserStatus userStatus
) {
}
