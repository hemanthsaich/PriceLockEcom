package com.example.pricelock.service;

import com.example.pricelock.model.Product;
import com.example.pricelock.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Get a product by ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Create a new product
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Update an existing product
    public Optional<Product> updateProduct(Long id, Product productDetails) {
        return productRepository.findById(id).map(product -> {
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            product.setOfferPrice(productDetails.getOfferPrice());
            return productRepository.save(product);
        });
    }

    // Delete a product by ID
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
