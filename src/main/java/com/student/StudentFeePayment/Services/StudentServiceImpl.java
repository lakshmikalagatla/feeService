package com.student.StudentFeePayment.Services;

import com.student.StudentFeePayment.Beans.Fee;
import com.student.StudentFeePayment.DTOs.PaymentDTO;
import com.student.StudentFeePayment.DTOs.TransactionRequest;
import com.student.StudentFeePayment.Repository.StudentRespository;
import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRespository studentRespository;

    @Override
    public HttpStatus updateStudent(TransactionRequest payment) {
            Fee fee = new Fee();
            fee.setAmount(payment.getPaymentDetails().getAmount());
            fee.setType(payment.getPaymentDetails().getType());
            fee.setStudentId(payment.getStudentId());
            studentRespository.save(fee);
            return HttpStatus.OK;
    }

}
