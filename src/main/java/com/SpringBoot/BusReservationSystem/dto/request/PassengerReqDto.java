package com.SpringBoot.BusReservationSystem.dto.request;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import com.SpringBoot.BusReservationSystem.enums.Status;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record PassengerReqDto(
        @NotBlank(message = "Email cannot be empty")
        @Email(message = "Invalid email")
        String email,

        @NotBlank(message = "Password cannot be empty")
        @Size(min = 8, max = 20,
                message = "Password should be between 8 and 20 characters")
        String password,

        @NotBlank(message = "Full name cannot be empty")
        @Size(min = 3, max = 100,
                message = "Full name should be between 3 and 100 characters")
        String fullName,

        @NotBlank(message = "Phone number cannot be empty")
        @Pattern(
                regexp = "^[6-9]\\d{9}$",
                message = "Phone number must be a valid 10-digit Indian mobile number"
        )
        String phoneNumber,

        @NotBlank(message = "Emergency contact cannot be empty")
        @Pattern(
                regexp = "^[6-9]\\d{9}$",
                message = "Emergency contact must be a valid 10-digit Indian mobile number"
        )
        String emergencyContact,

        @NotNull(message = "Date of birth cannot be null")
        LocalDate dob,

        @NotNull(message = "Gender cannot be null")
        Gender gender,

        @NotBlank(message = "Address cannot be empty")
        @Size(max = 500,
                message = "Address should not exceed 500 characters")
        String address
) {
}
