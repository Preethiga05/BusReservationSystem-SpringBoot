package com.SpringBoot.BusReservationSystem.dto.request;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import com.SpringBoot.BusReservationSystem.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record BusOperatorReqDto(
        // User Details
        @NotBlank(message = "Full name cannot be empty")
        String fullName,

        @NotBlank(message = "Email cannot be empty")
        String email,

        @NotBlank(message = "Password cannot be empty")
        String password,

        // Bus Operator Details
        @NotBlank(message = "Company name cannot be empty")
        @Size(min = 3, max = 100)
        String companyName,

        @NotBlank(message = "Licence number cannot be empty")
        String licenceNumber,

        @NotBlank(message = "Company address cannot be empty")
        @Size(max = 2000)
        String companyAddress,

        @NotBlank(message = "Phone number cannot be empty")
        @Pattern(regexp = "^[6-9]\\d{9}$")
        String phoneNumber,

        @NotNull(message = "Gender cannot be null")
        Gender gender

) {
}
