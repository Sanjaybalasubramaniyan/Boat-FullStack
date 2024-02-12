package com.boat.jagan.service.impl;





import java.util.List;

import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.boat.jagan.dto.request.BookingRequest;
import com.boat.jagan.dto.response.BasicResponse;
import com.boat.jagan.dto.response.BookingResponse;
import com.boat.jagan.dto.response.PaymentResponse;
import com.boat.jagan.model.Booking;
import com.boat.jagan.model.Payment;
import com.boat.jagan.repository.BookingRepository;
import com.boat.jagan.service.BookingService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService{

    private final BookingRepository BookingRepository;
   
    @Override
    public BasicResponse<BookingResponse> getAllUser() {
        List<Booking> books=BookingRepository.findAll();
       
        List<BookingResponse> bookResponses = books.stream()
        .map(book-> BookingResponse.builder()

        .bookingId(book.getBookingId())
        .noOfPersons(book.getNoOfPersons())
        .fromDate(book.getFromDate())
        .toDate(book.getToDate())
        .totalPrice(book.getTotalPrice())
        .build())
        .collect(Collectors.toList());
        return BasicResponse.<BookingResponse>builder()
        .message("User Data fetched").data(bookResponses).build();
    }

      @Override
        public BasicResponse<BookingResponse> deletebooking(Long bookingId) {
            
            if (BookingRepository.existsById(bookingId)) {
                BookingRepository.deleteById(bookingId);
                return BasicResponse.<BookingResponse>builder()
                    .message("Booking deleted successfully")
                    .build();
            } else {
                return BasicResponse.<BookingResponse>builder()
                    .message("Booking not found with ID: " + bookingId)
                    .build();
            }
        }
        @Override
        public BasicResponse<BookingResponse> updateBooking(Long id, BookingRequest request) {
            // Retrieve the existing booking from the repository
            Booking existingBooking = BookingRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Booking not found with id: " + id));
        
            // Update the booking details
            existingBooking.setBookingId(request.getBookingId());
            existingBooking.setFromDate(request.getFromDate());
            existingBooking.setToDate(request.getToDate());
            existingBooking.setNoOfPersons(request.getNoOfPersons());
            existingBooking.setTotalPrice(request.getTotalPrice());
         

        
            // Save the updated booking to the repository
            BookingRepository.save(existingBooking);
        
            // Construct and return the response
            BookingResponse updatedBookingResponse = mapToBookingResponse(existingBooking);
            return BasicResponse.<BookingResponse>builder()
                    .message("Booking updated successfully")
                    .data(List.of(updatedBookingResponse)) // Pass a list containing a single updated booking response
                    .build();
        }

        private BookingResponse mapToBookingResponse(Booking existingBooking) {
            // TODO Auto-generated method stub
            return BookingResponse.builder()
            .bookingId(existingBooking.getBookingId())
            .fromDate(existingBooking.getFromDate())
            .toDate(existingBooking.getToDate())
            .noOfPersons(existingBooking.getNoOfPersons())
            .totalPrice(existingBooking.getTotalPrice())
     .build();
        }

        

}