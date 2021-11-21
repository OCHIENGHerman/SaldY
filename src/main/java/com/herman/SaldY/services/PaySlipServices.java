package com.herman.SaldY.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.herman.SaldY.model.PaySlip;

import com.herman.SaldY.repository.PaySlipRepository;

@Service
@Transactional
public class PaySlipServices {

    private final PaySlipRepository payRepository;

    public PaySlipServices(PaySlipRepository payRepository) {
        this.payRepository = payRepository;
    }

    public void savePayslip(PaySlip payslip) {

        payRepository.save(payslip);
    }

    public PaySlip findByEmail(String email) {
        return payRepository.findByEmail(email);
    }


}