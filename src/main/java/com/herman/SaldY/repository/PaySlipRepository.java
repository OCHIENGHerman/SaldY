package com.herman.SaldY.repository;

import com.herman.SaldY.model.PaySlip;
import org.springframework.data.repository.CrudRepository;
public interface PaySlipRepository extends CrudRepository<PaySlip, Integer> {

    public PaySlip findByEmail(String email);
}