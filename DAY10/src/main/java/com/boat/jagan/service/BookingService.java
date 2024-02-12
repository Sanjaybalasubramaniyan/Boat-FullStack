package com.boat.jagan.service;

import com.boat.jagan.dto.request.BookingRequest;
import com.boat.jagan.dto.response.BasicResponse;
import com.boat.jagan.dto.response.BookingResponse;

public interface BookingService {
    BasicResponse<BookingResponse>getAllUser();
    BasicResponse<BookingResponse> deletebooking(Long id);
    BasicResponse<BookingResponse> updateBooking(Long id, BookingRequest request);

}