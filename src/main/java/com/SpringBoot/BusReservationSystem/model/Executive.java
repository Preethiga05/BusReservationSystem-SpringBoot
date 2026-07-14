package com.SpringBoot.BusReservationSystem.model;

import com.SpringBoot.BusReservationSystem.enums.Gender;
import com.SpringBoot.BusReservationSystem.enums.JobTitle;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "executives")
public class Executive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long executiveId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(unique = true,nullable = false,updatable = false)
    private String employeeCode;

    @Enumerated(EnumType.STRING)
    private JobTitle jobTitle;

    @Column(nullable = false,unique = true,length = 10)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

}
