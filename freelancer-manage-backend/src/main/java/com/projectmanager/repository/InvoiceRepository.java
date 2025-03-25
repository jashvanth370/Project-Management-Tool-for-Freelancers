// src/main/java/com/projectmanager/repository/InvoiceRepository.java
package com.projectmanager.repository;

import com.projectmanager.model.Invoice;
import com.projectmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByProject(Project project);
}