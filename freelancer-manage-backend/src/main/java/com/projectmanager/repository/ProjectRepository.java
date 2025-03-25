// src/main/java/com/projectmanager/repository/ProjectRepository.java
package com.projectmanager.repository;

import com.projectmanager.model.Client;
import com.projectmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    List<Project> findByClient(Client client);
}