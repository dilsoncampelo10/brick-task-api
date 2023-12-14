package com.dilson.bricktask.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.dilson.bricktask.enums.TaskStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Column(nullable = true, columnDefinition = "varchar(255) default 'photo.jpg'")
    private String image;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, updatable = false)
    private User user;

    @CreationTimestamp
    private LocalDateTime date;
}
