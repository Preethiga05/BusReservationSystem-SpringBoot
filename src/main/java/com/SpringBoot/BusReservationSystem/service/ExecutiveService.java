package com.SpringBoot.BusReservationSystem.service;

import com.SpringBoot.BusReservationSystem.dto.request.ExecutiveReqDto;
import com.SpringBoot.BusReservationSystem.dto.request.UserRequestDto;
import com.SpringBoot.BusReservationSystem.enums.Role;
import com.SpringBoot.BusReservationSystem.mapper.ExecutiveMapper;
import com.SpringBoot.BusReservationSystem.mapper.UserMapper;
import com.SpringBoot.BusReservationSystem.model.Executive;
import com.SpringBoot.BusReservationSystem.model.User;
import com.SpringBoot.BusReservationSystem.repository.ExecutiveRepository;
import com.SpringBoot.BusReservationSystem.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExecutiveService {
    private final UserRepository userRepository;
    private final ExecutiveRepository executiveRepository;

    public Executive add(@Valid ExecutiveReqDto executiveReqDto) {

        User user = UserMapper.mapDtoToEntity(
                executiveReqDto.fullName(),
                executiveReqDto.email(),
                executiveReqDto.password(),
                Role.EXECUTIVE
        );

        user = userRepository.save(user);

        Executive executive = ExecutiveMapper.mapDtoToEntity(executiveReqDto);

        executive.setUser(user);

        executiveRepository.save(executive);

        return executive;
    }
}

