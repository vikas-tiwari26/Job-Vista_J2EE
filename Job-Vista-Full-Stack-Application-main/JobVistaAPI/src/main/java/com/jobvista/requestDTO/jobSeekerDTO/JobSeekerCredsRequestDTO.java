package com.jobvista.requestDTO.jobSeekerDTO;

import lombok.Data;

@Data
public class JobSeekerCredsRequestDTO {
    private String email;
    private String password;

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }
}

