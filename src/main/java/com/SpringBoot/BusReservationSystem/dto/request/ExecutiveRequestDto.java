package com.SpringBoot.BusReservationSystem.dto.request;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import com.SpringBoot.BusReservationSystem.enums.JobTitle;
import jakarta.validation.constraints.*;

public record ExecutiveRequestDto(
        @NotBlank(message = "Full Name is mandatory")
        @Size(min = 3, max = 100,
                message = "Full Name must be between 3 and 100 characters")
        String fullName,

        @NotBlank(message = "Email is mandatory")
        @Email(message = "Please enter a valid email address")
        String email,

        @NotBlank(message = "Password is mandatory")
        @Size(min = 8, max = 20,
                message = "Password must be between 8 and 20 characters")
        @Pattern(
                regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,20}$",
                message = "Password must contain at least one uppercase letter, one lowercase letter, one digit and one special character"
        )
        String password,

        @NotBlank(message = "Phone Number is mandatory")
        @Pattern(
                regexp = "^[6-9]\\d{9}$",
                message = "Phone Number must be a valid 10-digit Indian mobile number"
        )
        String phoneNumber,

        @NotNull(message = "Gender is mandatory")
        Gender gender,

        @NotBlank(message = "Address is mandatory")
        @Size(min = 10, max = 500,
                message = "Address must be between 10 and 500 characters")
        String address,

        @NotBlank(message = "Employee Code is mandatory")
        @Pattern(
                regexp = "^EMP\\d{3,5}$",
                message = "Employee Code must be in the format EMP001"
        )
        String employeeCode,

        @NotNull(message = "Job Title is mandatory")
        JobTitle jobTitle
) {
}
