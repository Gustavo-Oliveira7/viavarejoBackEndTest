package com.gustavo.backendviavarejo.controller;

import com.gustavo.backendviavarejo.models.Product;
import com.gustavo.backendviavarejo.models.ProductPayment;
import com.gustavo.backendviavarejo.models.TotalPayment;
import com.gustavo.backendviavarejo.service.MainService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @PostMapping
    public TotalPayment create(@RequestBody ProductPayment product){
        TotalPayment totalPayment = mainService.getResult(product);
        return totalPayment;
    }
}
