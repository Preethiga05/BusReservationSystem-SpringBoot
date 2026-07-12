package com.SpringBoot.BusReservationSystem.service;

import com.SpringBoot.BusReservationSystem.dto.request.UserRequestDto;
import com.SpringBoot.BusReservationSystem.dto.response.UserResponseDto;
import com.SpringBoot.BusReservationSystem.exceptions.ResourceNotFoundException;
import com.SpringBoot.BusReservationSystem.mapper.UserMapper;
import com.SpringBoot.BusReservationSystem.model.User;
import com.SpringBoot.BusReservationSystem.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;
    public User add(@Valid UserRequestDto userRequestDto) {
        User user = userMapper.mapDtoToEntity(userRequestDto);
        return userRepository.save(user);
    }

    public List<UserResponseDto> getAll() {
        List<User> list = userRepository.findAll();
        return list.stream()
                .map(userMapper :: mapEntityToDto)
                .toList();
    }

    public UserResponseDto getById(long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Id not Valid"));
        return userMapper.mapEntityToDto(user);
    }

    public void update(UserRequestDto userRequestDto, long id) {
        User user = userRepository.findById(id)
                        .orElseThrow(() -> new ResourceNotFoundException(("Invalid Id")));
        user.setFullName(userRequestDto.fullName());
        user.setEmail(userRequestDto.email());
        user.setPhoneNumber(userRequestDto.phoneNumber());
        user.setPassword(userRequestDto.password());
        user.setGender(userRequestDto.gender());
        user.setAddress(userRequestDto.address());

        userRepository.save(user);
    }

    public void softDelete(long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        user.setActive(false);
        userRepository.save(user);
    }

    public void hardDelete(long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        userRepository.deleteById(id);
    }
}
