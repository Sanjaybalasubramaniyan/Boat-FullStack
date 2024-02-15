package com.boat.sanjay45.Service;

import com.boat.sanjay45.dto.request.BookingRequest;
import com.boat.sanjay45.dto.response.BasicResponse;
import com.boat.sanjay45.dto.response.BookingResponse;


public interface BookingService {
    BasicResponse<BookingResponse>getAllUser();

    BookingResponse createBook(BookingRequest request);

    BasicResponse<BookingResponse> deletebook(String giftid);

    BookingResponse updatebook(String giftid, BookingRequest giftRequest);
}
