package com.SpringBoot.BusReservationSystem.controller;

import com.SpringBoot.BusReservationSystem.dto.request.BusOperatorReqDto;
import com.SpringBoot.BusReservationSystem.model.BusOperator;
import com.SpringBoot.BusReservationSystem.service.BusOperatorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bus-operator/")

public class BusOperatorController {
    private final BusOperatorService busOperatorService;
    @PostMapping("/add/{executiveId}")
    public BusOperator add(@PathVariable long executiveId,@Valid @RequestBody BusOperatorReqDto busOperatorReqDto){
        return busOperatorService.add(executiveId,busOperatorReqDto);
    }
}
