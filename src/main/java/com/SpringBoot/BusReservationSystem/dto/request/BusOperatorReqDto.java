package com.SpringBoot.BusReservationSystem.dto.request;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record BusOperatorReqDto(
         String name,
         String email,
         String password,

        @NotBlank(message = "Company name is mandatory")
        String companyName,

        @NotBlank(message = "Licence number is mandatory")
        @Size(min = 5, max = 50,
                message = "Licence number must be between 5 and 50 characters")
        String licenceNumber,

        @NotBlank(message = "Company address is mandatory")
        @Size(min = 10, max = 2000,
                message = "Company address must be between 10 and 2000 characters")
        String companyAddress,

        @NotBlank(message = "Phone number is mandatory")
        @Pattern(
                regexp = "^[6-9]\\d{9}$",
                message = "Phone number must be a valid 10-digit Indian mobile number"
        )
        String phoneNumber

) {
}
