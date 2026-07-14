package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.RouteReqDto;
import com.SpringBoot.BusReservationSystem.model.Route;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

@Component
public class RouteMapper {
    public static Route mapDtoToEntity(@Valid RouteReqDto routeReqDto) {
        Route route = new Route();
        route.setOriginCity(routeReqDto.originCity());
        route.setDestinationCity(routeReqDto.destinationCity());
        route.setDistanceKm(routeReqDto.distanceKm());
        route.setEstimatedDurationMinutes(routeReqDto.estimatedDurationMinutes());
        route.setStatus(routeReqDto.status());

        return route;
    }
}
