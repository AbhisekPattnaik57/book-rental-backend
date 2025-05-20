package com.abhi.bookrental.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping
    public ResponseEntity<String> makePayment(@RequestBody Map<String, Object> paymentData) {
        System.out.println("Payment request received: " + paymentData);
        return ResponseEntity.ok("Payment successful ✅");
    }
}
