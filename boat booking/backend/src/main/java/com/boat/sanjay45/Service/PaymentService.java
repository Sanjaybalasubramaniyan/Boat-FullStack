package com.boat.sanjay45.Service;


import com.boat.sanjay45.dto.request.PaymentRequest;
import com.boat.sanjay45.dto.response.BasicResponse;
import com.boat.sanjay45.dto.response.PaymentResponse;

public interface PaymentService {
    BasicResponse<PaymentResponse>getAllUser();

    PaymentResponse createPay(PaymentRequest request);
}
