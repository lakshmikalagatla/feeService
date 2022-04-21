package com.student.StudentFeePayment.Controllers;

import com.student.StudentFeePayment.DTOs.PaymentDTO;
import com.student.StudentFeePayment.DTOs.TransactionRequest;
import com.student.StudentFeePayment.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/dopayment")
    public HttpStatus updateStudent(@RequestBody TransactionRequest updatedpayment) {
        System.out.println("Entered Fee Service");
        return studentService.updateStudent(updatedpayment);
    }

}
