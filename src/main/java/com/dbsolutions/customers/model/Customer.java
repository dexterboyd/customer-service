package com.dbsolutions.customers.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Getter
@Setter
@ToString
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence")
    private Long customerId;
    private String name;
    private String email;
    private String mobileNumber;
    private LocalDate date;

    public Customer() {
    }

    public Customer(String name, String email, String mobileNumber, LocalDate date) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.date = date;
    }

    public Customer(Long customerId, String name, String email, String mobileNumber, LocalDate date) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.date = date;
    }
}
