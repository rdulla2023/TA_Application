package com.application.springboot.repository;

import com.application.springboot.model.TA_Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TA_ApplicantRepository extends JpaRepository<TA_Applicant, String> {
    //all crud database methods
}
