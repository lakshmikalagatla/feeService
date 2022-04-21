package com.student.StudentFeePayment.Repository;

import com.student.StudentFeePayment.Beans.Fee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRespository extends CrudRepository<Fee, Integer> {
}
