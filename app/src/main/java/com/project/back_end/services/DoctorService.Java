package com.project.back_end.services;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Service
public class DoctorService {

    public List<String> getAvailableSlots(Long doctorId, LocalDate date) {
        // Dummy data for assignment
        return List.of("09:00", "10:00", "11:30");
    }

    public Map<String, Object> validateDoctorLogin(String email, String password) {
        if ("doctor@test.com".equals(email) && "password".equals(password)) {
            return Map.of(
                    "status", "SUCCESS",
                    "message", "Login successful"
            );
        }

        return Map.of(
                "status", "FAILED",
                "message", "Invalid credentials"
        );
    }
}
