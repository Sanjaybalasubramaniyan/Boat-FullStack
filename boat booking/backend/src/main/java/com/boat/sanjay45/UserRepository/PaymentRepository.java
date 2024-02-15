package com.boat.sanjay45.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boat.sanjay45.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,String> {

}
