package com.herman.SaldY.model;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Admin [email=" + email + ", password=" + password + "]";
    }


    public Admin()
    {

    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Admin(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }

}