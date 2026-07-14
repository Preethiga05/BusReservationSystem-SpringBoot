package com.SpringBoot.BusReservationSystem.repository;

import com.SpringBoot.BusReservationSystem.model.Executive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExecutiveRepository extends JpaRepository<Executive,Long> {
}
