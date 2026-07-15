package com.SpringBoot.BusReservationSystem.service;

import com.SpringBoot.BusReservationSystem.dto.request.RouteRequestDto;
import com.SpringBoot.BusReservationSystem.exceptions.ResourceNotFoundException;
import com.SpringBoot.BusReservationSystem.mapper.RouteMapper;
import com.SpringBoot.BusReservationSystem.model.Bus;
import com.SpringBoot.BusReservationSystem.model.Route;
import com.SpringBoot.BusReservationSystem.repository.BusRepository;
import com.SpringBoot.BusReservationSystem.repository.RouteRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RouteService {
    private final BusRepository busRepository;
    private final RouteRepository routeRepository;
    public Route add(long busId, @Valid RouteRequestDto routeRequestDto) {
        Bus bus = busRepository.findById(busId)
                .orElseThrow(() -> new ResourceNotFoundException("Bus id invalid"));

        Route route = RouteMapper.mapDtoToEntity(routeRequestDto);

        route.setBus(bus);

        return routeRepository.save(route);
    }
}
