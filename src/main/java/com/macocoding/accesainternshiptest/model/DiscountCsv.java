package com.macocoding.accesainternshiptest.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class DiscountCsv {
    private String productId;
    private String productName;
    private String brand;
    private String packageQuantity;
    private String packageUnit;
    private String productCategory;
    private LocalDate fromDate;
    private LocalDate toDate;
    private int discountPercentage;
}
