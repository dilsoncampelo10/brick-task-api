package com.dilson.bricktask.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.dilson.bricktask.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dilson.bricktask.models.Task;
import com.dilson.bricktask.repositories.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserService userService;

    public List<Task> findAll() {
        return this.taskRepository.findAll();
    }

    public Task findById(Long id) {
        Optional<Task> task = this.taskRepository.findById(id);

        return task.orElseThrow(() -> new RuntimeException("Tarefa não encontrada!"));
    }

    public Task create(Task task) {
        User user = this.userService.findById(task.getUser().getId());
        task.setId(null);
        task.setUser(user);
        task = this.taskRepository.save(task);
        return task;
    }

    @Transactional
    public Task update(Task task) {
        Task newTask = findById(task.getId());
        newTask.setDescription(task.getDescription());
        newTask.setStatus(task.getStatus());
        return newTask;
    }

}
