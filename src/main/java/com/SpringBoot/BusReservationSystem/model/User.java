package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import com.SpringBoot.BusReservationSystem.enums.Role;
import com.SpringBoot.BusReservationSystem.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(nullable = false,length = 100)
    private String fullName;

    @Column(nullable = false,length = 150,unique = true)
    private String email;

    @Column(nullable = false,unique = true,length = 10)
    private String phoneNumber;

    @Column(nullable = false,length = 15,unique = true)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = false,length = 500)
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserStatus userStatus = UserStatus.ACTIVE;

    private Instant lastLogin;

    @CreationTimestamp
    @Column(updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;

}
