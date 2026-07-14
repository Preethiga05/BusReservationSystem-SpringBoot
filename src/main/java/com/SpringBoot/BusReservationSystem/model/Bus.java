package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.BusType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "buses")
public class Bus {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long busId;

    @Column(nullable = false)
    private String busName;

    @Column(nullable = false,updatable = false,unique = true)
    private String busNumber;

    @Enumerated(EnumType.STRING)
    private BusType busType;

    @Column(nullable = false)
    private int totalSeats;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BusStatus busStatus;
}
