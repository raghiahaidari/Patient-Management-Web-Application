package com.example.springmvc_springdata_jpathymeleaf;

import com.example.springmvc_springdata_jpathymeleaf.entities.Patient;
import com.example.springmvc_springdata_jpathymeleaf.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringMvcSpringDataJpaThymeleafApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository ;
    public static void main(String[] args) {
        SpringApplication.run(SpringMvcSpringDataJpaThymeleafApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 23));
        patientRepository.save(new Patient(null, "Ahmed", new Date(), true, 63));
        patientRepository.save(new Patient(null, "Laila", new Date(), false, 13));
    }
}
