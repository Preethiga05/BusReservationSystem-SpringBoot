package com.SpringBoot.BusReservationSystem.controller;

import com.SpringBoot.BusReservationSystem.dto.request.ExecutiveReqDto;
import com.SpringBoot.BusReservationSystem.model.Executive;
import com.SpringBoot.BusReservationSystem.service.ExecutiveService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/executive")
public class ExecutiveController {
    private final ExecutiveService executiveService;
    @PostMapping("/add")
    public Executive add(@Valid @RequestBody ExecutiveReqDto executiveReqDto){
        return executiveService.add(executiveReqDto);
    }
}
