package com.SpringBoot.BusReservationSystem.controller;

import com.SpringBoot.BusReservationSystem.dto.request.BusOperatorReqDto;
import com.SpringBoot.BusReservationSystem.dto.request.BusReqDto;
import com.SpringBoot.BusReservationSystem.model.Bus;
import com.SpringBoot.BusReservationSystem.service.BusService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bus/")
public class BusController {
    private final BusService busService;
    @PostMapping("/add/{busOpId}")
    public Bus add(@PathVariable long busOpId, @Valid @RequestBody BusReqDto busReqDto){
        return busService.add(busOpId,busReqDto);
    }
}
