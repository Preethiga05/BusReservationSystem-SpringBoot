package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.BusOperatorRequestDto;
import com.SpringBoot.BusReservationSystem.dto.response.BusOperatorResponseDto;
import com.SpringBoot.BusReservationSystem.model.BusOperator;
import org.springframework.stereotype.Component;

@Component
public class BusOperatorMapper {

    public static BusOperatorResponseDto mapEntityToDto(BusOperator operator) {
        return new BusOperatorResponseDto(

                operator.getBusOpId(),
                operator.getCompanyName(),
                operator.getLicenceNumber(),
                operator.getCompanyAddress(),
                operator.getPhoneNumber(),
                operator.getGender(),
                operator.getUser().getFullName(),
                operator.getUser().getEmail()

        );
    }

    public static BusOperator mapDtoToEntity(BusOperatorRequestDto busOperatorRequestDto) {
        BusOperator busOperator = new BusOperator();

        busOperator.setCompanyName(busOperatorRequestDto.companyName());
        busOperator.setLicenceNumber(busOperatorRequestDto.licenceNumber());
        busOperator.setCompanyAddress(busOperatorRequestDto.companyAddress());
        busOperator.setPhoneNumber(busOperatorRequestDto.phoneNumber());
        busOperator.setGender(busOperatorRequestDto.gender());

        return busOperator;

    }
}
