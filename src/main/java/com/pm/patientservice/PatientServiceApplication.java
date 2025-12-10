package com.pm.patientservice;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatientServiceApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatientServiceApplication.class, args);
	}

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Patient Service I up Now");
    }


}
