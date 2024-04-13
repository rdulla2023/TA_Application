package com.application.springboot.impl;

import com.application.springboot.model.TA_Applicant;
import com.application.springboot.repository.TA_ApplicantRepository;
import com.application.springboot.service.service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceImpl implements service {

    private TA_ApplicantRepository taApplicantRepository;

    public serviceImpl(TA_ApplicantRepository taApplicantRepository) {
        super();
        this.taApplicantRepository = taApplicantRepository;
    }

    @Override
    public TA_Applicant saveTA_Applicant(TA_Applicant taApplicant) {
        return taApplicantRepository.save(taApplicant);
    }

    @Override
    public List<TA_Applicant> getAllApplicant() {
        return taApplicantRepository.findAll();
    }
}
