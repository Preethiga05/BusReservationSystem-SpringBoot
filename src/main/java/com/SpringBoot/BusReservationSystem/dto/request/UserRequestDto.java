package com.SpringBoot.BusReservationSystem.dto.request;

import jakarta.validation.constraints.*;

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

        @NotBlank(message = "Password is Mandatory")
        @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
        @Pattern(
                regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,20}$",
                message = "Password must contain at least one uppercase letter, one lowercase letter, one digit, and one special character"
        )
        String password
) {
}
