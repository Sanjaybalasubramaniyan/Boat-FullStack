package com.boat.sanjay45.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boat.sanjay45.Service.PaymentService;
import com.boat.sanjay45.dto.request.PaymentRequest;
import com.boat.sanjay45.dto.response.BasicResponse;
import com.boat.sanjay45.dto.response.PaymentResponse;

import static com.boat.sanjay45.Utils.MyConstant.PayBook;
import static com.boat.sanjay45.Utils.MyConstant.Postpay;
import static com.boat.sanjay45.Utils.MyConstant.USER;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;
import static org.springframework.http.HttpStatus.OK;

import org.springframework.http.HttpStatus;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping(USER)
@RequiredArgsConstructor
public class PaymentController {
     private final PaymentService payService;
    //   private final PaymentRepository payrepo;

    @GetMapping(PayBook)
    public ResponseEntity<BasicResponse<PaymentResponse>> getUser(){
        BasicResponse<PaymentResponse> response=new BasicResponse<>();
        try{
            response=payService.getAllUser();
            return new ResponseEntity<>(response, OK);
        }
        catch(Exception exception){
            response.setMessage("Something Went Wrong");
            return new ResponseEntity<>(response,EXPECTATION_FAILED);
        }
    }

    @PostMapping(Postpay)
    public ResponseEntity<PaymentResponse> createPayment(@RequestBody PaymentRequest request) {
        PaymentResponse response = new PaymentResponse();
        try {
            response = payService.createPay(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch(Exception e) {
            response.setMessage("Something went Wrong!");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
  
    
}
