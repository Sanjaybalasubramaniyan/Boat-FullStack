package com.boat.jagan.service;

import com.boat.jagan.dto.request.PaymentRequest;
import com.boat.jagan.dto.response.BasicResponse;
import com.boat.jagan.dto.response.PaymentResponse;


public interface PaymentService {
    BasicResponse<PaymentResponse>getAllUser();
    BasicResponse<PaymentResponse> deletePayment(Long id);
    BasicResponse<PaymentResponse> updatePayment(Long id, PaymentRequest request);

}