package com.macocoding.accesainternshiptest.service.core;

import com.macocoding.accesainternshiptest.dto.ProductDto;
import com.macocoding.accesainternshiptest.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductDto> getAllProducts();
    Optional<ProductDto> getProductById(String id);
    ProductDto createProduct(ProductDto productDto);
    ProductDto updateProduct(String id, ProductDto productDto);
    void deleteProduct(String id);
}
