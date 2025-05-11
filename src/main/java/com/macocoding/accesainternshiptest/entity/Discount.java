package com.macocoding.accesainternshiptest.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Table(name = "discounts")
@Data
public class Discount {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    private Product product;

    private LocalDate fromDate;
    private LocalDate toDate;
    private int discountPercentage;
}
