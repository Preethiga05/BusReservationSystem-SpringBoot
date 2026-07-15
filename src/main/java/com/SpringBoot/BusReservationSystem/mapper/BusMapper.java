package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.BusRequestDto;
import com.SpringBoot.BusReservationSystem.model.Bus;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

@Component
public class BusMapper {
    public static Bus mapDtoToEntity(@Valid BusRequestDto busRequestDto) {
        Bus bus = new Bus();
        bus.setBusName(busRequestDto.busName());
        bus.setBusNumber(busRequestDto.busNumber());
        bus.setBusType(busRequestDto.busType());
        bus.setTotalSeats(busRequestDto.totalSeats());
        bus.setBusStatus(busRequestDto.busStatus());

        return bus;
    }
}
