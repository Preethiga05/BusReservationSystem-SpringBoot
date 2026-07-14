package com.SpringBoot.BusReservationSystem.controller;

import com.SpringBoot.BusReservationSystem.dto.request.RouteReqDto;
import com.SpringBoot.BusReservationSystem.model.Route;
import com.SpringBoot.BusReservationSystem.service.RouteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/route")
public class RouteController {
    private final RouteService routeService;
    @PostMapping("/add/{busId}")
    public Route add(@PathVariable long busId, @Valid @RequestBody RouteReqDto routeReqDto){
        return routeService.add(busId,routeReqDto);
    }
}
