// src/main/java/com/projectmanager/dto/RegisterRequest.java
package com.projectmanager.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String email;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String businessName;
}