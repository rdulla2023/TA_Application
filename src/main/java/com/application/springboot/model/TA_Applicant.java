package com.application.springboot.model;

import jakarta.persistence.*;
import lombok.*;

/*@Getter
@Setter*/
@Data
/*@NoArgsConstructor
@AllArgsConstructor*/
@Entity
@Table(name = "teachingAssistant")
public class TA_Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Z_no;
    @Column(name = "first_name", nullable = false )
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
}
