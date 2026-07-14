package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.CancellationStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "cancellations")
public class Cancellation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cancellation_id")
    private Long cancellationId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", nullable = false, unique = true)
    private Booking booking;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cancelled_by_user_id", nullable = false)
    private User cancelledBy;

    @Column(name = "cancellation_reason", length = 255)
    private String cancellationReason;

    @Enumerated(EnumType.STRING)
    @Column(name = "cancellation_status", nullable = false)
    private CancellationStatus cancellationStatus = CancellationStatus.REQUESTED;

    @Column(name = "cancelled_at", insertable = false, updatable = false)
    private LocalDateTime cancelledAt;
}
