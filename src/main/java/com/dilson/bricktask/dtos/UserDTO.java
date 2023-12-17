package com.dilson.bricktask.dtos;

import jakarta.validation.constraints.NotBlank;

public class UserDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

}
