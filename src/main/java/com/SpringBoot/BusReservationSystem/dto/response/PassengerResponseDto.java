package com.SpringBoot.BusReservationSystem.dto.response;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record PassengerResponseDto(
        String fullName,
        String phoneNumber,
        String emergencyContact,
        LocalDate dob,
        Gender gender,
        String address
) {
}
