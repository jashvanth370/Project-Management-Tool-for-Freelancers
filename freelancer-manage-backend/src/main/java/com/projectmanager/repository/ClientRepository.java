// src/main/java/com/projectmanager/repository/ClientRepository.java
package com.projectmanager.repository;

import com.projectmanager.model.Client;
import com.projectmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByUser(User user);
}