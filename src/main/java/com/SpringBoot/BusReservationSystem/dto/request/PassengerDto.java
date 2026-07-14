package com.SpringBoot.BusReservationSystem.dto.request;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record PassengerDto(
        @NotNull(message = "User Id is required")
        Long id,

        @NotBlank(message = "Emergency contact is required")
        @Pattern(
                regexp = "^[6-9]\\d{9}$",
                message = "Emergency contact must be a valid 10-digit Indian mobile number"
        )
        String emergencyContact,

        @NotNull(message = "Date of birth is required")
        @Past(message = "Date of birth must be in the past")
        LocalDate dob,

        @NotBlank(message = "Phone number is required")
        @Pattern(
                regexp = "^[6-9]\\d{9}$",
                message = "Phone number must be a valid 10-digit Indian mobile number"
        )
        String phoneNumber,

        @NotNull(message = "Gender is required")
        Gender gender,

        @NotBlank(message = "Address is required")
        @Size(min = 10, max = 500,
                message = "Address must be between 10 and 500 characters")
        String address
) {
}
