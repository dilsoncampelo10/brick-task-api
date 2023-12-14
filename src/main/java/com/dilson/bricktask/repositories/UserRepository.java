package com.dilson.bricktask.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilson.bricktask.models.User;

public interface UserRepository extends JpaRepository<User, UUID> {

}
