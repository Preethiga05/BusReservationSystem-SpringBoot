package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.Deck;
import com.SpringBoot.BusReservationSystem.enums.SeatType;
import com.SpringBoot.BusReservationSystem.enums.Status;
import jakarta.persistence.*;

public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Long seatId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id", nullable = false)
    private Bus bus;

    @Column(name = "seat_number", nullable = false, length = 10)
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type", nullable = false)
    private SeatType seatType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Deck deck = Deck.LOWER;

    @Column(name = "is_window_seat")
    private Boolean isWindowSeat = false;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status = Status.ACTIVE;
}
