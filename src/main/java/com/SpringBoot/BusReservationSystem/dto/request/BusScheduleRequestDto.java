package com.SpringBoot.BusReservationSystem.dto.request;

import com.SpringBoot.BusReservationSystem.enums.Status;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record BusScheduleRequestDto(
        LocalDate journeyDate,
        LocalDateTime departureDateTime,
        LocalDateTime arrivalDateTime,
        BigDecimal fare
) {
}
