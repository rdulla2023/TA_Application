package com.application.springboot;

import com.application.springboot.model.TA_Applicant;
import com.application.springboot.repository.TA_ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private TA_ApplicantRepository taApplicantRepository;

	/*@Override
	public void run(String... args) throws Exception {
		TA_Applicant taApplicant1 = new TA_Applicant();
		taApplicant1.setFirstName("Ramya");
		taApplicant1.setLastName("Dulla");
		taApplicant1.setEmail("rdulla2023@fau.edu");
		taApplicantRepository.save(taApplicant1);

		TA_Applicant taApplicant2 = new TA_Applicant();
		taApplicant2.setFirstName("Kavya");
		taApplicant2.setLastName("Janu");
		taApplicant2.setEmail("kjanu@fau.edu");
		taApplicantRepository.save(taApplicant2);

	}*/


}
