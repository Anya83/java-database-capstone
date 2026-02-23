package com.smartclinic.system.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping
    public ResponseEntity<?> savePrescription(
            @RequestHeader("Authorization") String token,
            @Valid @RequestBody Map<String, String> prescriptionRequest
    ) {
        if (token == null || !token.startsWith("Bearer ")) {
            return ResponseEntity.status(401)
                    .body(Map.of("error", "Invalid or missing token"));
        }

        // Dummy save logic for assignment
        return ResponseEntity.ok(
                Map.of(
                        "message", "Prescription saved successfully",
                        "status", "SUCCESS"
                )
        );
    }
}
