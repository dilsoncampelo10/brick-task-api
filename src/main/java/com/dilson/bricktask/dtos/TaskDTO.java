package com.dilson.bricktask.dtos;

import com.dilson.bricktask.enums.TaskStatus;
import com.dilson.bricktask.models.User;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaskDTO {
    @NotBlank
    private String description;

    @NotBlank
    private TaskStatus status;

   
    private String image;

    @NotBlank
    private User user;

}
