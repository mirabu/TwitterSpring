package com.example.TwitterSpring.Controller;


import com.example.TwitterSpring.Model.PaymentRequest;
import com.example.TwitterSpring.Model.PaymentResponse;
import com.example.TwitterSpring.Repo.PaymentImpl;
import com.example.TwitterSpring.Repo.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class PaymentController {

    @Autowired
    private PaymentImpl payment;

    @PostMapping("/process-payment")
    public ResponseEntity<PaymentResponse> processPayment(@Valid @RequestBody PaymentRequest paymentRequest) {
        PaymentResponse response = payment.processPayment(paymentRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/verify-payment")
    public ResponseEntity<PaymentResponse> verifyPayment(
            @RequestParam("razorpay_order_id") String orderId,
            @RequestParam("razorpay_payment_id") String paymentId,
            @RequestParam("razorpay_signature") String signature) {

        // Implement payment verification logic here
        PaymentResponse response = new PaymentResponse(true, "Payment verified successfully");
        response.setOrderId(orderId);
        response.setPaymentId(paymentId);
        response.setSignature(signature);

        return ResponseEntity.ok(response);
    }
}
