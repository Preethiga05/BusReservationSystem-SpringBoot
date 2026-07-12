package com.SpringBoot.BusReservationSystem.controller;

import com.SpringBoot.BusReservationSystem.dto.request.UserRequestDto;
import com.SpringBoot.BusReservationSystem.dto.response.UserResponseDto;
import com.SpringBoot.BusReservationSystem.model.User;
import com.SpringBoot.BusReservationSystem.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bus-reservation/")
public class UserController {
    private final UserService userService;

    @PostMapping("/add-user")
    public User add(@Valid @RequestBody UserRequestDto userRequestDto){
        return userService.add(userRequestDto);
    }

    @GetMapping("/get-all")
    public List<UserResponseDto> getAll(){
        return userService.getAll();
    }

    @GetMapping("/get-by-id/{id}")
    public UserResponseDto getById(@PathVariable long id){
        return userService.getById(id);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody UserRequestDto userRequestDto,@PathVariable long id){
        userService.update(userRequestDto,id);
    }

    @DeleteMapping("/delete/{id}")
    public void softDelete(@PathVariable long id){
        userService.softDelete(id);
    }

}
