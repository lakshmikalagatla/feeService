package com.student.StudentFeePayment.DTOs;

public class TransactionRequest {
    Integer StudentId;

    public TransactionRequest(Integer studentId, PaymentDTO paymentDetails) {
        StudentId = studentId;
        this.paymentDetails = paymentDetails;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    public PaymentDTO getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(PaymentDTO paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    PaymentDTO paymentDetails;
}
