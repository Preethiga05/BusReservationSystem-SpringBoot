package com.SpringBoot.BusReservationSystem.service;

import com.SpringBoot.BusReservationSystem.dto.request.BusScheduleRequestDto;
import com.SpringBoot.BusReservationSystem.exceptions.ResourceNotFoundException;
import com.SpringBoot.BusReservationSystem.mapper.BusScheduleMapper;
import com.SpringBoot.BusReservationSystem.model.Bus;
import com.SpringBoot.BusReservationSystem.model.BusSchedule;
import com.SpringBoot.BusReservationSystem.model.Route;
import com.SpringBoot.BusReservationSystem.repository.BusRepository;
import com.SpringBoot.BusReservationSystem.repository.BusScheduleRepository;
import com.SpringBoot.BusReservationSystem.repository.RouteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusScheduleService {
    private final BusRepository busRepository;
    private final RouteRepository routeRepository;
    private final BusScheduleRepository busScheduleRepository;
    public BusSchedule add(long busId, long routeId, BusScheduleRequestDto busScheduleRequestDto) {
        Bus bus = busRepository.findById(busId)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Bus Id"));
        Route route = routeRepository.findById(routeId)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Route Id"));

        BusSchedule busSchedule = BusScheduleMapper.mapDtoToEntity(busScheduleRequestDto);
        busSchedule.setBookedSeats(0);
        busSchedule.setBus(bus);
        busSchedule.setRoute(route);

        return busScheduleRepository.save(busSchedule);
    }
}
