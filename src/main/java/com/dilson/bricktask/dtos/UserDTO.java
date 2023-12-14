package com.dilson.bricktask.dtos;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.validation.constraints.NotBlank;

public class UserDTO {
    @NotBlank
    private String name;

    @NotBlank
    @UniqueElements
    private String email;

    @NotBlank
    private String password;

}
