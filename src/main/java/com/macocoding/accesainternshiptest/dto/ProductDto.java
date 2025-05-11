package com.macocoding.accesainternshiptest.dto;

import lombok.Data;

@Data
public class ProductDto {
    private String productId;
    private String productName;
    private String productCategory;
    private String brand;
    private double packageQuantity;
    private String packageUnit;
    private double price;
    private String currency;
}
