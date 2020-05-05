package com.example.spring_boot_app.controllers;

import com.example.spring_boot_app.model.Product;
import com.example.spring_boot_app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")  // toate endpoint-urile vor fi prefixate cu product
public class ProductControllers {

    @Autowired
    private ProductService productService;

    @PostMapping("/add") //vom apela endpoint-ul cu /product/add
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping("/get")
    public List<Product> getProduct(){
        return productService.getAllProducts();
    }
}
