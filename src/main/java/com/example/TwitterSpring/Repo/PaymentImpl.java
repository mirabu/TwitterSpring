package com.example.TwitterSpring.Repo;

import com.example.TwitterSpring.Model.PaymentRequest;
import com.example.TwitterSpring.Model.PaymentResponse;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentImpl implements PaymentService{

    @Value("${razorpay.key.id}")
    private String razorpayKeyId;

    @Value("${razorpay.key.secret}")
    private String razorpayKeySecret;

    @Override
    public PaymentResponse processPayment(PaymentRequest paymentRequest) {
        try {
            RazorpayClient razorpayClient = new RazorpayClient(razorpayKeyId, razorpayKeySecret);

            JSONObject orderRequest = new JSONObject();
            orderRequest.put("amount", paymentRequest.getAmount().intValue());
            orderRequest.put("currency", paymentRequest.getCurrency());
            orderRequest.put("receipt", paymentRequest.getReceipt());

            // Add notes if available
            if (paymentRequest.getNotes() != null && !paymentRequest.getNotes().isEmpty()) {
                JSONObject notes = new JSONObject();
                for (String key : paymentRequest.getNotes().keySet()) {
                    notes.put(key, paymentRequest.getNotes().get(key));
                }
                orderRequest.put("notes", notes);
            }

            Order order = razorpayClient.orders.create(orderRequest);

            return new PaymentResponse(true, "Order created successfully", order.get("id"));
        } catch (RazorpayException e) {
            return new PaymentResponse(false, "Error creating Razorpay order: " + e.getMessage());
        }
    }
}
