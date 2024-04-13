package com.application.springboot.controller;

import com.application.springboot.exception.ResourceNotFoundException;
import com.application.springboot.model.TA_Applicant;
import com.application.springboot.repository.TA_ApplicantRepository;
import com.application.springboot.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/TA_applicant")
public class TA_ApplicantController {

    private service applicantService;

    public TA_ApplicantController(service applicantService) {
        super();
        this.applicantService = applicantService;
    }
    //build get TA_applicant REST API
    @PostMapping()
    public ResponseEntity<TA_Applicant> saveTAapplicant(@RequestBody TA_Applicant taApplicant) {
       // TA_Applicant applicant = taApplicantRepository.findById(Z_no).orElseThrow(() -> new ResourceNotFoundException("Applicant does not exists with ID :" + Z_no));
        return new ResponseEntity<TA_Applicant>(applicantService.saveTA_Applicant(taApplicant),HttpStatus.CREATED);
    }
    //build get all employees REST API
    @GetMapping
    public List<TA_Applicant> getAllTAapplicants(){
        return applicantService.getAllApplicant();
    }

    /*@Autowired
    private TA_ApplicantRepository taApplicantRepository;



    //build create TA_applicant REST API
    @PostMapping
    public TA_Applicant createTAapplicant(@RequestBody TA_Applicant applicant){
        return taApplicantRepository.save(applicant);
    }


    //build update TA_applicant REST API
    @PutMapping("{Z_no}")
    public ResponseEntity<TA_Applicant> updateTAapplicant(@PathVariable String Z_no,@RequestBody TA_Applicant applicant){
        TA_Applicant updateTAapplicant = taApplicantRepository.findById(Z_no).orElseThrow(() -> new ResourceNotFoundException("Applicant does not exists with ID :" + Z_no));

        updateTAapplicant.setFirstName(applicant.getFirstName());
        updateTAapplicant.setLastName(applicant.getLastName());
        updateTAapplicant.setEmail(applicant.getEmail());
        //updateTAapplicant.getZ_no(applicant.getZ_no());

        taApplicantRepository.save(updateTAapplicant);

        return ResponseEntity.ok(updateTAapplicant);
    }

    //build delete TA_applicant REST API
    @DeleteMapping("{Z_no}")
    public ResponseEntity<HttpStatus> deleteTAapplicant(@PathVariable String Z_no){
        TA_Applicant applicant = taApplicantRepository.findById(Z_no).orElseThrow(() -> new ResourceNotFoundException("Applicant does not exists with ID :" + Z_no));

        taApplicantRepository.delete(applicant);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }*/
}
