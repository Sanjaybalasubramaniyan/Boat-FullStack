package com.boat.jagan.controller;



import static com.boat.jagan.util.MyConstant.Pay;
import static com.boat.jagan.util.MyConstant.UserPay;
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

import com.boat.jagan.dto.request.PaymentRequest;
import com.boat.jagan.dto.response.BasicResponse;
import com.boat.jagan.dto.response.PaymentResponse;
import com.boat.jagan.model.Payment;
import com.boat.jagan.repository.PaymentRepository;
import com.boat.jagan.service.PaymentService;
import com.boat.jagan.util.MyConstant;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(Pay)
@RequiredArgsConstructor
public class PaymentController {
      private final PaymentService PaymentService;
      private final PaymentRepository Paymentrepo;

    @GetMapping(UserPay)
    public ResponseEntity<BasicResponse<PaymentResponse>> getUser(){
        BasicResponse<PaymentResponse> response=new BasicResponse<>();
        try{
            response=PaymentService.getAllUser();
            return new ResponseEntity<>(response, OK);
        }
        catch(Exception exception){
            response.setMessage("Something Went Wrong");
            return new ResponseEntity<>(response,EXPECTATION_FAILED);
        }
    }

    @SuppressWarnings("null")
    @PostMapping(PostBook)
    public Payment create(@RequestBody Payment models) {
        return Paymentrepo.save(models);
    }
    
@DeleteMapping(MyConstant.Pay + "/{PaymentId}")
    public ResponseEntity<BasicResponse<PaymentResponse>> deletePayment(@PathVariable Long PaymentId) {
        BasicResponse<PaymentResponse> response = new BasicResponse<>();
        try {
            BasicResponse<PaymentResponse> deletedBookingResponse = PaymentService.deletePayment(PaymentId);
            response.setMessage(deletedBookingResponse.getMessage());
            return new ResponseEntity<>(response, OK);
        } catch (Exception e) {
            response.setMessage("Failed to delete Payment: " + e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping(MyConstant.Pay+ "/{paymentId}")
public ResponseEntity<BasicResponse<PaymentResponse>> updatePayment(@PathVariable Long paymentId, @RequestBody PaymentRequest paymentrequest) {
    BasicResponse<PaymentResponse> response = new BasicResponse<>();
    try {
        BasicResponse<PaymentResponse> updatedBookingResponse =PaymentService.updatePayment(paymentId, paymentrequest);
        response.setMessage(updatedBookingResponse.getMessage());
        response.setData(updatedBookingResponse.getData());
        return new ResponseEntity<>(response, OK);
    } catch (Exception e) {
        response.setMessage("Failed to update Payment: " + e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}


    
}