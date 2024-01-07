package com.example.hotelmanagementsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity(name="Customer")
@Getter
@Setter
public class Customer{
    @Id
            @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastName;
    String email;
    String mobileNo;
    int age;
    Gender gender;
    Date dateOfBirth;
    boolean isMarried;
    Date dateOfMarriage;
    IdentityCardType identityCardType;
    String identityCardNumber;
    int totalBookings;
}
