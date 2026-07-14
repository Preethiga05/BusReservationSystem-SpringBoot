package com.SpringBoot.BusReservationSystem.mapper;

import com.SpringBoot.BusReservationSystem.dto.request.PassengerDto;
import com.SpringBoot.BusReservationSystem.model.Passenger;
import com.SpringBoot.BusReservationSystem.model.User;

public class PassengerMapper {
    public static Passenger mapDtoToEntity(PassengerDto dto, User user) {
        Passenger passenger = new Passenger();

        passenger.setUser(user);
        passenger.setEmergencyContact(dto.emergencyContact());
        passenger.setDob(dto.dob());
        passenger.setPhoneNumber(dto.phoneNumber());
        passenger.setGender(dto.gender());
        passenger.setAddress(dto.address());

        return passenger;
    }
    public static PassengerDto mapEntityToDto(Passenger passenger) {

        return new PassengerDto(
                passenger.getUser().getUserId(),
                passenger.getEmergencyContact(),
                passenger.getDob(),
                passenger.getPhoneNumber(),
                passenger.getGender(),
                passenger.getAddress()
        );
    }
}
