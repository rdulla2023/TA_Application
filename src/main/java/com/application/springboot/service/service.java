package com.application.springboot.service;

import com.application.springboot.model.TA_Applicant;

import java.util.List;

public interface service {

    TA_Applicant saveTA_Applicant(TA_Applicant taApplicant);
    List<TA_Applicant> getAllApplicant();

}
