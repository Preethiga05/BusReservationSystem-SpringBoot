package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import com.SpringBoot.BusReservationSystem.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "passengers")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false,unique = true,length = 10)
    private String phoneNumber;

    @Column(nullable = false)
    private String emergencyContact;

    private LocalDate Dob;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = false,length = 500)
    private String address;

    private Instant lastLogin;

    @CreationTimestamp
    @Column(updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;

    @Enumerated(EnumType.STRING)
    private Status passengerStatus;

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
}
