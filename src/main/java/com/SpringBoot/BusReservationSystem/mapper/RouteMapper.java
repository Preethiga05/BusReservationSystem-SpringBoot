package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.RouteRequestDto;
import com.SpringBoot.BusReservationSystem.model.Route;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

@Component
public class RouteMapper {
    public static Route mapDtoToEntity(@Valid RouteRequestDto routeRequestDto) {
        Route route = new Route();
        route.setOriginCity(routeRequestDto.originCity());
        route.setDestinationCity(routeRequestDto.destinationCity());
        route.setDistanceKm(routeRequestDto.distanceKm());
        route.setEstimatedDurationMinutes(routeRequestDto.estimatedDurationMinutes());
        route.setStatus(routeRequestDto.status());

        return route;
    }
}
