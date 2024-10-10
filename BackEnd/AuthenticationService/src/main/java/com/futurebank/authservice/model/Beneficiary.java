package com.futurebank.authservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "beneficiaries")
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId; // This assumes you have a User entity defined with a 'userId' field

    @NotBlank(message = "Beneficiary name cannot be blank")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Account number cannot be blank")
    @Column(nullable = false, unique = true)
    private String accountNumber;

    @NotBlank(message = "Bank name cannot be blank")
    @Column(nullable = false)
    private String bankName;

    @NotBlank(message = "Bank branch cannot be blank")
    @Column(nullable = false)
    private String bankBranch;

    @NotBlank(message = "IFSC code cannot be blank")
    @Column(nullable = false)
    private String ifscCode;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email should be valid")
    @Column(nullable = false)
    private String email;

    @NotBlank(message = "Phone number cannot be blank")
    @Column(nullable = false)
    private String phoneNumber;

    public Beneficiary() {
        // Default constructor
    }

    // Getters and Setters for email and phoneNumber are already generated by Lombok @Getter and @Setter annotations
}