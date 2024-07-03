package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/make")
    public Payment makePayment(@RequestBody Payment payment) {
        return paymentService.savePayment(payment);
    }
}

