package com.SpringBoot.BusReservationSystem.service;

import com.SpringBoot.BusReservationSystem.dto.request.UserRequestDto;
import com.SpringBoot.BusReservationSystem.mapper.UserMapper;
import com.SpringBoot.BusReservationSystem.model.User;
import com.SpringBoot.BusReservationSystem.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;
    public User add(@Valid UserRequestDto userRequestDto) {
        User user = userMapper.mapDtoToEntity(userRequestDto);
        return userRepository.save(user);
    }
}
