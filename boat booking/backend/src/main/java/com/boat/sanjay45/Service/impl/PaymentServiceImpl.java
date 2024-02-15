package com.boat.sanjay45.Service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.boat.sanjay45.Service.PaymentService;
import com.boat.sanjay45.UserRepository.PaymentRepository;
import com.boat.sanjay45.dto.request.PaymentRequest;
import com.boat.sanjay45.dto.response.BasicResponse;
import com.boat.sanjay45.dto.response.PaymentResponse;
import com.boat.sanjay45.model.Payment;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService{
     private final PaymentRepository payRepository;

     @Override
     public BasicResponse<PaymentResponse> getAllUser() {
         List<Payment> payments = payRepository.findAll();
         List<PaymentResponse> payResponses = payments.stream().map(payment -> PaymentResponse.builder()
                 .paymentId(payment.getPaymentId())
                 .bookingId(payment.getBookingId())
                 .amount(payment.getAmount())
                 .paymentDate(payment.getPaymentDate())
                 .paymentMethod(payment.getPaymentMethod())
                 .build())
                 .collect(Collectors.toList());
 
         return BasicResponse.<PaymentResponse>builder()
                 .message("Payment Data fetched").data(payResponses).build();
     }

     @SuppressWarnings("null")
    @Override
    public PaymentResponse createPay(PaymentRequest request) {
        var pay = Payment.builder()
        .paymentId(request.getPaymentId())
        .bookingId(request.getBookingId())
        .amount(request.getAmount())
        .paymentDate(request.getPaymentDate())
        .paymentMethod(request.getPaymentMethod())
        .build();
        payRepository.save(pay);
        return PaymentResponse.builder()  
        .message("Slot Booked sucessfully")  
                .build();
    }
     
}
