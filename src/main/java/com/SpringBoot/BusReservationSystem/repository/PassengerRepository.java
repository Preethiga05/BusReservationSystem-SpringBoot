package com.SpringBoot.BusReservationSystem.repository;

import com.SpringBoot.BusReservationSystem.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    @Query("""
            select p
            from Passenger p
            where p.user.email = ?1
            """)
    Optional<Passenger> getbyEmail(String email);
}
