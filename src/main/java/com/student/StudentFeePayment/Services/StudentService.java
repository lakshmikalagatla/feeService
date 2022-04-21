package com.student.StudentFeePayment.Services;

import com.student.StudentFeePayment.DTOs.PaymentDTO;
import com.student.StudentFeePayment.DTOs.TransactionRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface StudentService {
    public HttpStatus updateStudent(TransactionRequest student);
}
