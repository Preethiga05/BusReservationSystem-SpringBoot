package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.TicketStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Long ticketId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", nullable = false, unique = true)
    private Booking booking;

    @Column(name = "pnr_number", nullable = false, unique = true, length = 20)
    private String pnrNumber;

    @Column(name = "qr_code", length = 255)
    private String qrCode;

    @Enumerated(EnumType.STRING)
    @Column(name = "ticket_status", nullable = false)
    private TicketStatus ticketStatus = TicketStatus.ACTIVE;

    @Column(name = "issued_at", insertable = false, updatable = false)
    private LocalDateTime issuedAt;
}
