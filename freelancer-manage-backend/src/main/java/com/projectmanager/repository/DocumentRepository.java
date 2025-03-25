// src/main/java/com/projectmanager/repository/DocumentRepository.java
package com.projectmanager.repository;

import com.projectmanager.model.Document;
import com.projectmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findByProject(Project project);
}