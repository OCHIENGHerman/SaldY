package com.herman.SaldY.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.herman.SaldY.model.Admin;
import com.herman.SaldY.repository.AdminRepo;

@Service
@Transactional
public class AdminService {

    private final AdminRepo adminRepository;

    public AdminService(AdminRepo adminRepository) {
        this.adminRepository = adminRepository;
    }
    public Admin findByEmailAndPassword(String email, String password) {
        return adminRepository.findByEmailAndPassword(email, password);
    }
}
