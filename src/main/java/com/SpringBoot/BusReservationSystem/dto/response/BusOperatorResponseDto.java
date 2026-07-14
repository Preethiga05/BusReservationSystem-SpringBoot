package com.SpringBoot.BusReservationSystem.dto.response;

import com.SpringBoot.BusReservationSystem.enums.Gender;

public record BusOperatorResponseDto(
        int busOpId,
        String companyName,
        String licenceNumber,
        String companyAddress,
        String phoneNumber,
        Gender gender,
        String userName,
        String userEmail
) {
}
