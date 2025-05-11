package com.macocoding.accesainternshiptest.mapper;

import com.macocoding.accesainternshiptest.dto.ProductDto;
import com.macocoding.accesainternshiptest.entity.Product;
import com.macocoding.accesainternshiptest.model.ProductCsv;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product fromCsvToEntity(ProductCsv productCsv) {
        Product product = new Product();
        product.setProductId(productCsv.getProductId());
        product.setProductName(productCsv.getProductName());
        product.setProductCategory(productCsv.getProductCategory());
        product.setBrand(productCsv.getBrand());
        product.setPackageQuantity(productCsv.getPackageQuantity());
        product.setPackageUnit(productCsv.getPackageUnit());
        product.setPrice(productCsv.getPrice());
        product.setCurrency(productCsv.getCurrency());
        return product;
    }

    public ProductDto fromEntityToDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setProductId(product.getProductId());
        productDto.setProductName(product.getProductName());
        productDto.setProductCategory(product.getProductCategory());
        productDto.setBrand(product.getBrand());
        productDto.setPackageQuantity(product.getPackageQuantity());
        productDto.setPackageUnit(product.getPackageUnit());
        productDto.setPrice(product.getPrice());
        productDto.setCurrency(product.getCurrency());
        return productDto;
    }

    public Product fromDtoToEntity(ProductDto productDto) {
        Product product = new Product();
        product.setProductId(productDto.getProductId());
        product.setProductName(productDto.getProductName());
        product.setProductCategory(productDto.getProductCategory());
        product.setBrand(productDto.getBrand());
        product.setPackageQuantity(productDto.getPackageQuantity());
        product.setPackageUnit(productDto.getPackageUnit());
        product.setPrice(productDto.getPrice());
        product.setCurrency(productDto.getCurrency());
        return product;
    }


}
