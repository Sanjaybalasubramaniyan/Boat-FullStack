package com.boat.jagan.service.impl;





import java.util.List;

import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.boat.jagan.dto.request.PaymentRequest;
import com.boat.jagan.dto.response.BasicResponse;
import com.boat.jagan.dto.response.BookingResponse;
import com.boat.jagan.dto.response.PaymentResponse;
import com.boat.jagan.model.Payment;
import com.boat.jagan.repository.PaymentRepository;
import com.boat.jagan.service.PaymentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService{

    private final PaymentRepository PaymentRepository;
   
    @Override
    public BasicResponse<PaymentResponse> getAllUser() {
        List<Payment> Payments=PaymentRepository.findAll();
       
        List<PaymentResponse> PaymentResponses = Payments.stream()
        .map(Payment-> PaymentResponse.builder()

        .paymentId(Payment.getPaymentId())
        .bookingId(Payment.getBookingId())
        .amount(Payment.getAmount())
        .paymentDate(Payment.getPaymentDate())
        .paymentMethod(Payment.getPaymentMethod())
        .build())
        .collect(Collectors.toList());
        return BasicResponse.<PaymentResponse>builder()
        .message("User Data fetched").data(PaymentResponses).build();
    }

      @Override
        public BasicResponse<PaymentResponse> deletePayment(Long PaymentId) {
            
            if (PaymentRepository.existsById(PaymentId)) {
                PaymentRepository.deleteById(PaymentId);
                return BasicResponse.<PaymentResponse>builder()
                    .message("Payment deleted successfully")
                    .build();
            } else {
                return BasicResponse.<PaymentResponse>builder()
                    .message("Payment not found with ID: " + PaymentId)
                    .build();
            }
        }
        @Override
        public BasicResponse<PaymentResponse> updatePayment(Long id, PaymentRequest request) {
            // Retrieve the existing booking from the repository
            Payment existingPayment = PaymentRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Payment not found with id: " + id));
        
            // Update the booking details
            existingPayment.setPaymentId(request.getPaymentId());
            existingPayment.setBookingId(request.getBookingId());
            existingPayment.setAmount(request.getAmount());
            existingPayment.setPaymentDate(request.getPaymentDate());
        //     existingPayment.setPaymentMethod(request.getPaymentMethod());
        

        
            // Save the updated booking to the repository
            PaymentRepository.save(existingPayment);
        
            // Construct and return the response
            PaymentResponse updatedPaymentResponse = mapToPaymentResponse(existingPayment);
            return BasicResponse.<PaymentResponse>builder()
                    .message("Payment updated successfully")
                    .data(List.of(updatedPaymentResponse)) // Pass a list containing a single updated booking response
                    .build();
        }

        private PaymentResponse mapToPaymentResponse(Payment existingPayment) {
                // TODO Auto-generated method stub
                 return PaymentResponse.builder()
                 .paymentId(existingPayment.getPaymentId())
            .bookingId(existingPayment.getBookingId())
            .amount(existingPayment.getAmount())
            .paymentDate(existingPayment.getPaymentDate())
            .paymentMethod(existingPayment.getPaymentMethod())
     .build();
        }

      


    
}