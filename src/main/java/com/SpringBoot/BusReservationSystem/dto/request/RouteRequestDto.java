package com.SpringBoot.BusReservationSystem.dto.request;

import com.SpringBoot.BusReservationSystem.enums.Status;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record RouteRequestDto(
        @NotBlank(message = "Origin city cannot be empty")
        @Size(min = 3, max = 100, message = "Origin city should be between 3 and 100 characters")
        String originCity,

        @NotBlank(message = "Destination city cannot be empty")
        @Size(min = 3, max = 100, message = "Destination city should be between 3 and 100 characters")
        String destinationCity,

        @NotNull(message = "Distance cannot be null")
        @DecimalMin(value = "1.0", inclusive = true, message = "Distance must be greater than 0")
        BigDecimal distanceKm,

        @NotNull(message = "Estimated duration cannot be null")
        @Positive(message = "Estimated duration must be greater than 0")
        Integer estimatedDurationMinutes,

        @NotNull(message = "Route status cannot be null")
        Status status
) {
}
