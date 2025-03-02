package com.example.TwitterSpring.Repo;

import com.example.TwitterSpring.Model.PaymentRequest;
import com.example.TwitterSpring.Model.PaymentResponse;

public interface PaymentService {

    PaymentResponse processPayment(PaymentRequest paymentRequest);
}
