package com.herman.SaldY.repository;

import com.herman.SaldY.model.Admin;
import org.springframework.data.repository.CrudRepository;
public interface AdminRepo extends CrudRepository<Admin, Integer> {

    public Admin findByEmailAndPassword(String email, String password);
}