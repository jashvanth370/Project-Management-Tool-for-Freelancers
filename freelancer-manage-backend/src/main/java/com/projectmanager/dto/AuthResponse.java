// src/main/java/com/projectmanager/dto/AuthResponse.java
package com.projectmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }
}