package com.dilson.bricktask.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilson.bricktask.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
