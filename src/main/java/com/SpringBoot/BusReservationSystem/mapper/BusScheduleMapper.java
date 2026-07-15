package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.BusScheduleRequestDto;
import com.SpringBoot.BusReservationSystem.model.BusSchedule;
import org.springframework.stereotype.Component;

@Component
public class BusScheduleMapper {
    public static BusSchedule mapDtoToEntity(BusScheduleRequestDto busScheduleRequestDto) {
        BusSchedule busSchedule = new BusSchedule();
        busSchedule.setJourneyDate(busScheduleRequestDto.journeyDate());
        busSchedule.setDepartureDateTime(busScheduleRequestDto.departureDateTime());
        busSchedule.setArrivalDateTime(busScheduleRequestDto.arrivalDateTime());
        busSchedule.setFare(busScheduleRequestDto.fare());

        return busSchedule;
    }
}
