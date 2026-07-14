package com.SpringBoot.BusReservationSystem.service;

import com.SpringBoot.BusReservationSystem.dto.request.BusOperatorReqDto;
import com.SpringBoot.BusReservationSystem.dto.request.BusReqDto;
import com.SpringBoot.BusReservationSystem.exceptions.ResourceNotFoundException;
import com.SpringBoot.BusReservationSystem.mapper.BusMapper;
import com.SpringBoot.BusReservationSystem.model.Bus;
import com.SpringBoot.BusReservationSystem.model.BusOperator;
import com.SpringBoot.BusReservationSystem.repository.BusOperatorRepository;
import com.SpringBoot.BusReservationSystem.repository.BusRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusService {
    private final BusRepository busRepository;
    private final BusOperatorRepository busOperatorRepository;
    public Bus add(long busOpId, @Valid BusReqDto busReqDto) {
        BusOperator busOperator = busOperatorRepository.findById(busOpId)
                .orElseThrow(() -> new ResourceNotFoundException("BusOperator Id invalid"));

        Bus bus = BusMapper.mapDtoToEntity(busReqDto);

        bus.setBusOperator(busOperator);

        busRepository.save(bus);

        return bus;
    }
}
