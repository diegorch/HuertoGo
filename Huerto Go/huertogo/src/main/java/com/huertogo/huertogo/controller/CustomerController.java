package com.huertogo.huertogo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huertogo.huertogo.model.Product;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private static final String JSON_RESPONSE = "application/json";
}
