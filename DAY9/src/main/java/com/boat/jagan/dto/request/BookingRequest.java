package com.boat.jagan.dto.request;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {

      private Long bookingId;
    private Integer noOfPersons;
    private Date fromDate;
    private Date toDate;
    private Double totalPrice;
}
