package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientReqeustDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient){
        PatientResponseDTO patientDto=new PatientResponseDTO();

        patientDto.setId(patient.getId().toString());
        patientDto.setName(patient.getName());
        patientDto.setEmail(patient.getEmail());
        patientDto.setAddress(patient.getAddress());
        patientDto.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDto;
    }

    public static Patient toModel(PatientReqeustDTO patientReqeustDTO){
        Patient patient=new Patient();
        patient.setName(patientReqeustDTO.getName());
        patient.setEmail(patientReqeustDTO.getEmail());
        patient.setAddress(patientReqeustDTO.getAddress());
        patient.setDateOfBirth(LocalDate.parse(patientReqeustDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientReqeustDTO.getRegisteredDate()));
        return patient;
    }
    

}
