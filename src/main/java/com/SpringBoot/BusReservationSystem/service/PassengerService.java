package com.SpringBoot.BusReservationSystem.service;

import com.SpringBoot.BusReservationSystem.dto.request.PassengerRequestDto;
import com.SpringBoot.BusReservationSystem.dto.response.PassengerResponseDto;
import com.SpringBoot.BusReservationSystem.enums.Role;
import com.SpringBoot.BusReservationSystem.exceptions.ResourceNotFoundException;
import com.SpringBoot.BusReservationSystem.mapper.PassengerMapper;
import com.SpringBoot.BusReservationSystem.mapper.UserMapper;
import com.SpringBoot.BusReservationSystem.model.Passenger;
import com.SpringBoot.BusReservationSystem.model.User;
import com.SpringBoot.BusReservationSystem.repository.PassengerRepository;
import com.SpringBoot.BusReservationSystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class PassengerService {
    private final PassengerRepository passengerRepository;
    private final UserRepository userRepository;
    public Passenger add(PassengerRequestDto passengerRequestDto) {
        User user = UserMapper.mapDtoToEntity(
                passengerRequestDto.fullName(),
                passengerRequestDto.email(),
                passengerRequestDto.password(),
                Role.EXECUTIVE
        );

        user = userRepository.save(user);

        Passenger passenger = PassengerMapper.mapDtoToEntity(passengerRequestDto);
        passenger.setUser(user);

        return passengerRepository.save(passenger);
    }

    public PassengerResponseDto getPassengerByEmail(String email) {
        Passenger passenger = passengerRepository.getbyEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Email id"));

        return PassengerMapper.mapEntityToDto(passenger);
    }
}
