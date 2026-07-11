package com.SpringBoot.BusReservationSystem.controller;

import com.SpringBoot.BusReservationSystem.dto.request.UserRequestDto;
import com.SpringBoot.BusReservationSystem.model.User;
import com.SpringBoot.BusReservationSystem.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bus-reservation/")
public class UserController {
    private final UserService userService;

    @PostMapping("/add-user")
    public User add(@Valid @RequestBody UserRequestDto userRequestDto){
        return userService.add(userRequestDto);
    }


}
