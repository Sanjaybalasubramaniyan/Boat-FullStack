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
public class BookingResponse {
     private Long bookingId;
    private Integer noOfPersons;
    private Date fromDate;
    private Date toDate;
    private Double totalPrice;

}
