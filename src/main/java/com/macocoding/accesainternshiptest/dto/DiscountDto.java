package com.macocoding.accesainternshiptest.dto;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
@Data
public class DiscountDto {
    private String productId;
    private LocalDate fromDate;
    private LocalDate toDate;
    private int discountPercentage;
}
