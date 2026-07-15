package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.ExecutiveRequestDto;
import com.SpringBoot.BusReservationSystem.model.Executive;
import org.springframework.stereotype.Component;

@Component
public class ExecutiveMapper {
    public static Executive mapDtoToEntity(ExecutiveRequestDto dto) {

        Executive executive = new Executive();

        executive.setEmployeeCode(dto.employeeCode());
        executive.setJobTitle(dto.jobTitle());
        executive.setPhoneNumber(dto.phoneNumber());
        executive.setGender(dto.gender());

        return executive;
    }
}
