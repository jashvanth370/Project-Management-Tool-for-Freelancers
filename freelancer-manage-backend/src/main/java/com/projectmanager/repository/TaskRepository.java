// src/main/java/com/projectmanager/repository/TaskRepository.java
package com.projectmanager.repository;

import com.projectmanager.model.Project;
import com.projectmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByProject(Project project);
}