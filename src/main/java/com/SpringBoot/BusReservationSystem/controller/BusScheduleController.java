package com.SpringBoot.BusReservationSystem.controller;

import com.SpringBoot.BusReservationSystem.dto.request.BusScheduleRequestDto;
import com.SpringBoot.BusReservationSystem.model.BusSchedule;
import com.SpringBoot.BusReservationSystem.service.BusScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bus-schedule")
public class BusScheduleController {
    private final BusScheduleService busScheduleService;
    @PostMapping("/add/{busId}/{routeId}")
    public BusSchedule add(@PathVariable long busId, @PathVariable long routeId, @RequestBody BusScheduleRequestDto busScheduleRequestDto){
        return busScheduleService.add(busId,routeId,busScheduleRequestDto);
    }
}
