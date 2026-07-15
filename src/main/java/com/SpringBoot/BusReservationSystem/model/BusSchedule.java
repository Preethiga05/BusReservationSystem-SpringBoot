package com.SpringBoot.BusReservationSystem.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BusSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Long scheduleId;

    @Column(name = "journey_date", nullable = false)
    private LocalDate journeyDate;

    @Column(name = "departure_datetime", nullable = false)
    private LocalDateTime departureDateTime;

    @Column(name = "arrival_datetime", nullable = false)
    private LocalDateTime arrivalDateTime;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal fare;

    @Column(name = "booked_seats")
    private Integer bookedSeats = 0;

    @Column(name = "created_at",updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at",updatable = false)
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "bus_id", nullable = false)
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;
}
