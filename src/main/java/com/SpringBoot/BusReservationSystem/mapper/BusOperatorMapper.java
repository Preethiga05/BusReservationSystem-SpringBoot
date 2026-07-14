package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.BusOperatorReqDto;
import com.SpringBoot.BusReservationSystem.dto.response.BusOperatorResponseDto;
import com.SpringBoot.BusReservationSystem.model.BusOperator;
import com.SpringBoot.BusReservationSystem.model.User;
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

    public static BusOperator mapDtoToEntity(BusOperatorReqDto busOperatorReqDto) {
        BusOperator busOperator = new BusOperator();

        busOperator.setCompanyName(busOperatorReqDto.companyName());
        busOperator.setLicenceNumber(busOperatorReqDto.licenceNumber());
        busOperator.setCompanyAddress(busOperatorReqDto.companyAddress());
        busOperator.setPhoneNumber(busOperatorReqDto.phoneNumber());
        busOperator.setGender(busOperatorReqDto.gender());

        return busOperator;

    }
}
