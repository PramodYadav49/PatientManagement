package com.pm.patientservice.service;

import com.pm.patientservice.dto.PatientReqeustDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.exception.EmailAlreadyExistsException;
import com.pm.patientservice.exception.PatientNotFoundException;
import com.pm.patientservice.mapper.PatientMapper;
import com.pm.patientservice.model.Patient;
import com.pm.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository){
        this.patientRepository=patientRepository;
    }

    public List<PatientResponseDTO> getPatient(){
        List<Patient> patients=patientRepository.findAll();
        List<PatientResponseDTO> patientResponseDTOs =patients.stream().map(patient->PatientMapper.toDTO(patient)).toList();
        return patientResponseDTOs;

    }

    public PatientResponseDTO createPatient(PatientReqeustDTO patientReqeustDTO){
        if(patientRepository.existsByEmail(patientReqeustDTO.getEmail())){
            throw new EmailAlreadyExistsException("A Patient with this email Already exists "+patientReqeustDTO.getEmail());
        }
        Patient newPatient=patientRepository.save(
                PatientMapper.toModel(patientReqeustDTO));

        return PatientMapper.toDTO(newPatient);
    }

    public PatientResponseDTO updatePatient(UUID id,PatientReqeustDTO patientReqeustDTO){


        if(patientRepository.existsByEmailAndIdNot(patientReqeustDTO.getEmail(),id)){
            throw new PatientNotFoundException("Patient Not Found By Id: "+id);
        }
        Patient patient=patientRepository.findById(id).orElseThrow(()->new PatientNotFoundException("Patient Not Found: "+id));
        patient.setName(patientReqeustDTO.getName());
        patient.setEmail(patientReqeustDTO.getEmail());
        patient.setAddress(patientReqeustDTO.getAddress());
        patient.setDateOfBirth(LocalDate.parse(patientReqeustDTO.getDateOfBirth()));

        Patient updatePatient=patientRepository.save(patient);
        return PatientMapper.toDTO(updatePatient);
    }

    public void deletePatient(UUID id){
        patientRepository.deleteById(id);
    }



}
