package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.BusOperatorReqDto;
import com.SpringBoot.BusReservationSystem.model.BusOperator;
import com.SpringBoot.BusReservationSystem.model.User;
import org.springframework.stereotype.Component;

@Component
public class BusOperatorMapper {
    public static BusOperator toEntity(BusOperatorReqDto dto, User user) {

        BusOperator operator = new BusOperator();

        operator.setUser(user);
        operator.setCompanyName(dto.companyName());
        operator.setOwnerName(dto.ownerName());
        operator.setLicenceNumber(dto.licenceNumber());
        operator.setCompanyAddress(dto.companyAddress());
        operator.setPhoneNumber(dto.phoneNumber());
        operator.setGender(dto.gender());

        return operator;
    }
    public static BusOperatorReqDto mapEntityToDto(BusOperator operator) {

        return new BusOperatorReqDto(
                operator.getUser().getUserId(),
                operator.getCompanyName(),
                operator.getOwnerName(),
                operator.getLicenceNumber(),
                operator.getCompanyAddress(),
                operator.getPhoneNumber(),
                operator.getGender()
        );
    }
}
