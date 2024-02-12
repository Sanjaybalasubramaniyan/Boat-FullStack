package com.boat.jagan.dto.response;


 
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponse {
    private Long paymentId;
    private Long bookingId;  
    private Double amount;
    private Date paymentDate;
    private String paymentMethod;
}