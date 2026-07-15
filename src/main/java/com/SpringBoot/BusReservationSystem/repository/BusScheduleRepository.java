package com.SpringBoot.BusReservationSystem.repository;

import com.SpringBoot.BusReservationSystem.model.BusSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BusScheduleRepository extends JpaRepository<BusSchedule,Long> {
}
