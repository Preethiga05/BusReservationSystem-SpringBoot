package com.SpringBoot.BusReservationSystem.dto.request;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import com.SpringBoot.BusReservationSystem.enums.Role;
import com.SpringBoot.BusReservationSystem.enums.UserStatus;
import jakarta.validation.constraints.*;

import java.time.Instant;

public record UserRequestDto(
        @NotBlank(message = "Name is Mandatory")
        @Size(min = 3, max = 100, message = "Full Name must be between 3 and 100 characters")
        @Pattern(
                regexp = "^[A-Za-z ]+$",
                message = "Full Name should contain only alphabets and spaces"
        )
        String fullName,

        @NotBlank(message = "Email is Mandatory")
        @Email(message = "Enter a valid email address")
        @Size(max = 150, message = "Email cannot exceed 150 characters")
        String email,

        @NotBlank(message = "Phone Number is Mandatory")
        @Pattern(
                regexp = "^[6-9]\\d{9}$",
                message = "Phone Number must be a valid 10-digit Indian mobile number"
        )
        String phoneNumber,

        @NotBlank(message = "Password is Mandatory")
        @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
        @Pattern(
                regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,20}$",
                message = "Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character"
        )
        String password,

        @NotNull(message = "Gender is mandatory")
        Gender gender,

        @NotBlank(message = "Address is Mandatory")
        @Size(min = 5, max = 500, message = "Address must be between 5 and 255 characters")
        String address
) {
}
