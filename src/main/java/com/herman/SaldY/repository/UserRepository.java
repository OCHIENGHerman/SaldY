package com.herman.SaldY.repository;

import com.herman.SaldY.model.User;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User , Integer> {

    public User findByUsernameAndPassword(String username, String password);
    public User findByUsername(String username);
    public User findByEmail(String email);

}