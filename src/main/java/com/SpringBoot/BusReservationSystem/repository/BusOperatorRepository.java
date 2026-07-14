package com.SpringBoot.BusReservationSystem.repository;

import com.SpringBoot.BusReservationSystem.model.BusOperator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusOperatorRepository extends JpaRepository<BusOperator,Long> {
}
