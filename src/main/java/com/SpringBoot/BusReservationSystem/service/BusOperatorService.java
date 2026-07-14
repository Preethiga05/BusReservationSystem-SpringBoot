package com.SpringBoot.BusReservationSystem.service;

import com.SpringBoot.BusReservationSystem.dto.request.BusOperatorReqDto;
import com.SpringBoot.BusReservationSystem.enums.Role;
import com.SpringBoot.BusReservationSystem.exceptions.ResourceNotFoundException;
import com.SpringBoot.BusReservationSystem.mapper.BusOperatorMapper;
import com.SpringBoot.BusReservationSystem.mapper.UserMapper;
import com.SpringBoot.BusReservationSystem.model.BusOperator;
import com.SpringBoot.BusReservationSystem.model.Executive;
import com.SpringBoot.BusReservationSystem.model.User;
import com.SpringBoot.BusReservationSystem.repository.BusOperatorRepository;
import com.SpringBoot.BusReservationSystem.repository.ExecutiveRepository;
import com.SpringBoot.BusReservationSystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusOperatorService {
    private final ExecutiveRepository executiveRepository;
    private final UserRepository userRepository;
    private final BusOperatorRepository busOperatorRepository;
    public BusOperator add(long executiveId,BusOperatorReqDto busOperatorReqDto) {
        Executive executive = executiveRepository.findById(executiveId)
                .orElseThrow(() -> new ResourceNotFoundException("Executive Id is invalid"));

        User user = UserMapper.mapDtoToEntity(
                busOperatorReqDto.fullName(),
                busOperatorReqDto.email(),
                busOperatorReqDto.password(),
                Role.BUSOPERATOR
        );
        user = userRepository.save(user);

        BusOperator busOperator = BusOperatorMapper.mapDtoToEntity(busOperatorReqDto);

        busOperator.setUser(user);
        busOperator.setExecutive(executive);

        busOperatorRepository.save(busOperator);

        return busOperator;
    }
}
