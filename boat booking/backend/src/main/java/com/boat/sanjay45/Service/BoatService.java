package com.boat.sanjay45.Service;

import com.boat.sanjay45.dto.request.BoatRequest;
import com.boat.sanjay45.dto.response.BasicResponse;
import com.boat.sanjay45.dto.response.BoatResponse;

public interface BoatService {

    BasicResponse<BoatResponse> getAllUser();

    BoatResponse createBoat(BoatRequest request); 

}
