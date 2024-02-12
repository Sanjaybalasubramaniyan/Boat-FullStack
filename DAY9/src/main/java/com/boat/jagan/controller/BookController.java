package com.boat.jagan.controller;



import static com.boat.jagan.util.MyConstant.Book;
import static com.boat.jagan.util.MyConstant.UserBook;
import static com.boat.jagan.util.MyConstant.PostBook;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boat.jagan.dto.request.BookingRequest;
import com.boat.jagan.dto.response.BasicResponse;
import com.boat.jagan.dto.response.BookingResponse;
import com.boat.jagan.model.Booking;
import com.boat.jagan.repository.BookingRepository;
import com.boat.jagan.service.BookingService;
import com.boat.jagan.util.MyConstant;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(Book)
@RequiredArgsConstructor
public class BookController {
      private final BookingService bookService;
      private final BookingRepository bookrepo;

    @GetMapping(UserBook)
    public ResponseEntity<BasicResponse<BookingResponse>> getUser(){
        BasicResponse<BookingResponse> response=new BasicResponse<>();
        try{
            response=bookService.getAllUser();
            return new ResponseEntity<>(response, OK);
        }
        catch(Exception exception){
            response.setMessage("Something Went Wrong");
            return new ResponseEntity<>(response,EXPECTATION_FAILED);
        }
    }

    @SuppressWarnings("null")
    @PostMapping(PostBook)
    public Booking create(@RequestBody Booking models) {
        return bookrepo.save(models);
    }
    
@DeleteMapping(MyConstant.Book + "/{bookingId}")
    public ResponseEntity<BasicResponse<BookingResponse>> deleteBooking(@PathVariable Long bookingId) {
        BasicResponse<BookingResponse> response = new BasicResponse<>();
        try {
            BasicResponse<BookingResponse> deletedBookingResponse = bookService.deletebooking(bookingId);
            response.setMessage(deletedBookingResponse.getMessage());
            return new ResponseEntity<>(response, OK);
        } catch (Exception e) {
            response.setMessage("Failed to delete booking: " + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping(MyConstant.Book+ "/{bookingId}")
public ResponseEntity<BasicResponse<BookingResponse>> updateBooking(@PathVariable Long bookingId, @RequestBody BookingRequest Bookingrequest) {
    BasicResponse<BookingResponse> response = new BasicResponse<>();
    try {
        BasicResponse<BookingResponse> updatedBookingResponse =bookService.updateBooking(bookingId, Bookingrequest);
        response.setMessage(updatedBookingResponse.getMessage());
        response.setData(updatedBookingResponse.getData());
        return new ResponseEntity<>(response, OK);
    } catch (Exception e) {
        response.setMessage("Failed to update booking: " + e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

private BookingResponse mapToBookingResponse(Booking existingBooking) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mapToBookingResponse'");
}
    
}