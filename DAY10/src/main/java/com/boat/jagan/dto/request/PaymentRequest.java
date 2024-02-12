package com.boat.jagan.dto.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {
    private Long paymentId;
    private Long bookingId;  // Assuming a payment is associated with a booking
    private Double amount;
    private Date paymentDate;
    private String paymentMethod;
    } 

