package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {

    // Dummy save method for assignment
    public Appointment bookAppointment(Appointment appointment) {
        // In real case: appointmentRepository.save(appointment)
        return appointment;
    }

    // Dummy fetch method for assignment
    public List<Appointment> getAppointmentsForDoctorByDate(Long doctorId, LocalDate date) {
        // In real case: repository query
        return List.of();
    }
}
