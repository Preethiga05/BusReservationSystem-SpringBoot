package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.BusOperatorReqDto;
import com.SpringBoot.BusReservationSystem.dto.request.BusReqDto;
import com.SpringBoot.BusReservationSystem.model.Bus;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

@Component
public class BusMapper {
    public static Bus mapDtoToEntity(@Valid BusReqDto busReqDto) {
        Bus bus = new Bus();
        bus.setBusName(busReqDto.busName());
        bus.setBusNumber(busReqDto.busNumber());
        bus.setBusType(busReqDto.busType());
        bus.setTotalSeats(busReqDto.totalSeats());
        bus.setBusStatus(busReqDto.busStatus());

        return bus;
    }
}
