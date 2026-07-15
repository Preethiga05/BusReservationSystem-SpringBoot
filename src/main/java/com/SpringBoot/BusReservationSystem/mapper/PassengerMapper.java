package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.PassengerReqDto;
import com.SpringBoot.BusReservationSystem.dto.response.PassengerResponseDto;
import com.SpringBoot.BusReservationSystem.enums.Status;
import com.SpringBoot.BusReservationSystem.model.Passenger;
import com.SpringBoot.BusReservationSystem.model.User;

public class PassengerMapper {
    public static Passenger mapDtoToEntity(PassengerReqDto dto) {
        Passenger passenger = new Passenger();

        passenger.setFullName(dto.fullName());
        passenger.setPhoneNumber(dto.phoneNumber());
        passenger.setEmergencyContact(dto.emergencyContact());
        passenger.setDob(dto.dob());
        passenger.setGender(dto.gender());
        passenger.setAddress(dto.address());
        passenger.setPassengerStatus(Status.ACTIVE);

        return passenger;
    }

    public static PassengerResponseDto mapEntityToDto(Passenger passenger) {
        return new PassengerResponseDto(
                passenger.getFullName(),
                passenger.getPhoneNumber(),
                passenger.getEmergencyContact(),
                passenger.getDob(),
                passenger.getGender(),
                passenger.getAddress()
        );
    }
}
