package com.SpringBoot.BusReservationSystem.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "amenities")
public class Amenity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long amenityId;

    @Column(nullable = false,unique = true)
    private String amenityName;

    @Column(length = 1000)
    private String description;
}
