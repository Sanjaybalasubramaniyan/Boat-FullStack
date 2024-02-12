package com.boat.jagan.model;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {
    @Id
    private Long paymentId;
    private Long bookingId;  // Assuming a payment is associated with a booking
    private Double amount;
    private Date paymentDate;
    private String paymentMethod;  // Credit card, PayPal, etc.

    // Constructors

    public Payment() {
        super();
    }

 

    // Getters and Setters

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {

        return paymentMethod;
    }
}