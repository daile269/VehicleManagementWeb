package com.springbootapp.vehicleapp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

    @Formula(value = "concat(firstname,' ',lastname)")
    private String fullName;

    private String title;
    private String initials;
    private String socialSecurityNumber;
    private String gender;
    private String maritalStatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;
    private String city;
    private String address;
    private String phone;
    private String email;
    private String photo;

    @ManyToOne
    @JoinColumn(name = "countryId",insertable = false,updatable = false)
    private Country country;
    private Long countryId;

    @ManyToOne
    @JoinColumn(name = "stateId",insertable = false,updatable = false)
    private State state;
    private Long stateId;
}
