package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.PointType;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Table(name = "boarding_dropping_points")
public class BoardingDroppingPoints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "point_id")
    private Long pointId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;

    @Column(name = "point_name", nullable = false, length = 150)
    private String pointName;

    @Enumerated(EnumType.STRING)
    @Column(name = "point_type", nullable = false)
    private PointType pointType;

    @Column(length = 255)
    private String address;

    @Column(length = 150)
    private String landmark;

    @Column(name = "point_time", nullable = false)
    private LocalTime pointTime;

    @Column(name = "created_at", insertable = false, updatable = false)
    private LocalDateTime createdAt;
}
