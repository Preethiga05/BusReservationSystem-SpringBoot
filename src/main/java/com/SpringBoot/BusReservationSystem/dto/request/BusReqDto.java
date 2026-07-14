package com.SpringBoot.BusReservationSystem.dto.request;

import com.SpringBoot.BusReservationSystem.enums.BusType;
import com.SpringBoot.BusReservationSystem.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record BusReqDto(
        @NotBlank(message = "Bus name cannot be empty")
        @Size(min = 3, max = 100, message = "Bus name should be between 3 and 100 characters")
        String busName,

        @NotBlank(message = "Bus number cannot be empty")
        @Size(min = 5, max = 20, message = "Bus number should be between 5 and 20 characters")
        String busNumber,

        @NotNull(message = "Bus type cannot be null")
        BusType busType,

        @Positive(message = "Total seats must be greater than zero")
        int totalSeats,

        @NotNull(message = "Bus status cannot be null")
        Status busStatus
) {
}
