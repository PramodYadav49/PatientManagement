package com.pm.patientservice.model;
import java.time.LocalDate;

public class Prescription {


    private String prescriptionId;


    private String patientName;
    private String medicationName;
    private String dosage;
    private String frequency;
    private int quantity;
    private LocalDate issueDate;
    private int refillsRemaining;

    public Prescription(String prescriptionId, String patientName, String medicationName, String dosage,
                        String frequency, int quantity, LocalDate issueDate, int refillsRemaining) {
        this.prescriptionId = prescriptionId;
        this.patientName = patientName;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.frequency = frequency;
        this.quantity = quantity;
        this.issueDate = issueDate;
        this.refillsRemaining = refillsRemaining;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public int getRefillsRemaining() {
        return refillsRemaining;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public String getPatientName() {
        return patientName;
    }



    public void setRefillsRemaining(int refillsRemaining) {
        this.refillsRemaining = refillsRemaining;
    }


}
