package com.boat.jagan.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.boat.jagan.model.Payment;



public interface PaymentRepository extends JpaRepository<Payment,Long> {

}
