
// PaymentResponse.java
package com.example.TwitterSpring.Model;

public class PaymentResponse {
    private boolean success;
    private String message;
    private String orderId;
    private String paymentId;
    private String signature;

    public PaymentResponse() {
    }

    public PaymentResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public PaymentResponse(boolean success, String message, String orderId) {
        this.success = success;
        this.message = message;
        this.orderId = orderId;
    }

    // Getters and Setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}