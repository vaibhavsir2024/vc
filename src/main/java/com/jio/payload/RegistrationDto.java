package com.jio.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationDto {

    private Long id;
    private String name;
    private String email;
    private String mobile;
    private String message;
}
