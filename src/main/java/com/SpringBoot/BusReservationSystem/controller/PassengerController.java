package com.SpringBoot.BusReservationSystem.controller;

import com.SpringBoot.BusReservationSystem.dto.request.PassengerReqDto;
import com.SpringBoot.BusReservationSystem.dto.response.PassengerResponseDto;
import com.SpringBoot.BusReservationSystem.model.Passenger;
import com.SpringBoot.BusReservationSystem.service.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/passenger/")
public class PassengerController {
    private final PassengerService passengerService;
    @PostMapping("/add")
    public Passenger add(@RequestBody PassengerReqDto passengerReqDto){
        return passengerService.add(passengerReqDto);
    }

    @GetMapping("/get-passenger/email")
    public PassengerResponseDto getPassengerByEmail(@RequestParam String email){
        return passengerService.getPassengerByEmail(email);
    }
}
