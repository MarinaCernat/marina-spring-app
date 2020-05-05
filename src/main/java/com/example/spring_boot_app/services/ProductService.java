package com.example.spring_boot_app.services;

import com.example.spring_boot_app.model.Product;
import com.example.spring_boot_app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Partea de Tranzactionabilitate
@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product){
        productRepository.addProduct(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.getProducts();
    }
}
