package com.example.springmvc_springdata_jpathymeleaf.repository;
import org.springframework.data.domain.Page;
import com.example.springmvc_springdata_jpathymeleaf.entities.Patient;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findByNomContains(String keyword, Pageable pageable);

}
