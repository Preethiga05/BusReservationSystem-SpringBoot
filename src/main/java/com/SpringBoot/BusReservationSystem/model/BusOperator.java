package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "bus_operators")
public class BusOperator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int busOpId;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false,updatable = false,unique = true)
    private String licenceNumber;

    @Column(nullable = false,length = 2000)
    private String companyAddress;

    @Column(nullable = false,unique = true,length = 10)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "executive_id",nullable = false)
    private Executive executive;

}
