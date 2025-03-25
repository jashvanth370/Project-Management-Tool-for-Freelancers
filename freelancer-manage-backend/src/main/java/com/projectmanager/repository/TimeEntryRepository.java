// src/main/java/com/projectmanager/repository/TimeEntryRepository.java
package com.projectmanager.repository;

import com.projectmanager.model.Project;
import com.projectmanager.model.Task;
import com.projectmanager.model.TimeEntry;
import com.projectmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimeEntryRepository extends JpaRepository<TimeEntry, Long> {
    List<TimeEntry> findByUser(User user);
    List<TimeEntry> findByProject(Project project);
    List<TimeEntry> findByTask(Task task);
}