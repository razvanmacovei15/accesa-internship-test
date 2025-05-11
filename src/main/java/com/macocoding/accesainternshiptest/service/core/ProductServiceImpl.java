package com.macocoding.accesainternshiptest.service.core;

import com.macocoding.accesainternshiptest.dto.ProductDto;
import com.macocoding.accesainternshiptest.entity.Product;
import com.macocoding.accesainternshiptest.mapper.ProductMapper;
import com.macocoding.accesainternshiptest.repository.ProductRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepo productRepo, ProductMapper productMapper) {
        this.productRepo = productRepo;
        this.productMapper = productMapper;
    }


    @Override
    public List<ProductDto> getAllProducts() {
        return productRepo.findAll().stream()
                .map(productMapper::fromEntityToDto)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ProductDto> getProductById(String id) {
        return productRepo.findById(id).map(productMapper::fromEntityToDto);
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = productMapper.fromDtoToEntity(productDto);
        Product savedProduct = productRepo.save(product);
        return convertToDto(savedProduct);
    }

    @Override
    public ProductDto updateProduct(String id, ProductDto productDto) {
        Product existingProduct = productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        existingProduct.setProductCategory(productDto.getProductCategory());
        existingProduct.setProductName(productDto.getProductName());
        existingProduct.setBrand(productDto.getBrand());
        existingProduct.setPackageQuantity(productDto.getPackageQuantity());
        existingProduct.setPackageUnit(productDto.getPackageUnit());
        existingProduct.setPrice(productDto.getPrice());
        existingProduct.setCurrency(productDto.getCurrency());

        Product updatedProduct = productRepo.save(existingProduct);
        return convertToDto(updatedProduct);
    }

    @Override
    public void deleteProduct(String id) {
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        productRepo.delete(product);
    }

    private ProductDto convertToDto(Product product) {
        return productMapper.fromEntityToDto(product);
    }
}
