package com.jio.service;

import com.jio.payload.RegistrationDto;

import java.util.List;

public interface RegistrationService {
    RegistrationDto createRegistration(RegistrationDto registrationDto);

    void deleteRegistration(long id);

    RegistrationDto updateRegistration(long id, RegistrationDto registrationDto);

    //List<RegistrationDto> getAllRegistrations();
}
