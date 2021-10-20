package com.huertogo.huertogo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.huertogo.huertogo.model.Product;
import com.huertogo.huertogo.model.ProductFiltersInput;
import com.huertogo.huertogo.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private static final String JSON_RESPONSE = "application/json";
    
    private static final Logger logger = LogManager.getLogger(ProductsController.class);
    
    @Autowired
    ProductService productService;

    @GetMapping(value = "/getProducts", produces = JSON_RESPONSE)
    public ResponseEntity<List<Product>> getProducts(@RequestBody ProductFiltersInput input) {
        logger.info("[GET] Entering to getProducts()");
    	
        List<Product> product = productService.getProductsService(input);    		

        logger.info("[GET] Exiting from getProducts()");
        return ResponseEntity.ok(product);
    }
    
    @GetMapping(value = "/getInput", produces = JSON_RESPONSE)
    public ResponseEntity<ProductFiltersInput> getInput() {
        logger.info("[GET] Entering to getInput()");
    	
        ProductFiltersInput product = productService.getInput();    		

        logger.info("[GET] Exiting from getInput()");
        return ResponseEntity.ok(product);
    }
}
