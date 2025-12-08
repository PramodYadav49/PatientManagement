package com.pm.patientservice.model;

import java.time.LocalDateTime;

public class Appointment {

    /** * ID Variable: The unique identifier for the appointment.
     */
    private String appointmentId;

    /**
     * Foreign Key Variables (Links to other entities)
     */
    private String patientId;
    private String doctorId;

    /**
     * Data Variables
     */
    private LocalDateTime appointmentDateTime;
    private String reasonForVisit;
    private String status;
    private String roomNumber;

    // --- Constructor ---

    public Appointment(String appointmentId, String patientId, String doctorId,
                       LocalDateTime appointmentDateTime, String reasonForVisit,
                       String status, String roomNumber) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDateTime = appointmentDateTime;
        this.reasonForVisit = reasonForVisit;
        this.status = status;
        this.roomNumber = roomNumber;
    }

    // --- Getter Methods ---

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    // ... (Other Getters omitted for brevity)

    // --- Setter Methods ---

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }
    // ... (Other Setters omitted for brevity)
}
