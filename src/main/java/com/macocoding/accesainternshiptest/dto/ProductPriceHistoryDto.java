package com.macocoding.accesainternshiptest.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ProductPriceHistoryDto {
    private Long id;
    private String productId;
    private double price;
    private String currency;
    private LocalDate date;
}
