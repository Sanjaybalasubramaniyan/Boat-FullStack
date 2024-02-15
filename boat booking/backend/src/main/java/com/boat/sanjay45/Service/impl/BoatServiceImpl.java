package com.boat.sanjay45.Service.impl;


import java.util.List;

import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.boat.sanjay45.Service.BoatService;
import com.boat.sanjay45.UserRepository.BoatRepository;
import com.boat.sanjay45.dto.request.BoatRequest;
import com.boat.sanjay45.dto.response.BasicResponse;
import com.boat.sanjay45.dto.response.BoatResponse;
import com.boat.sanjay45.model.Boat;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class BoatServiceImpl implements BoatService{
     private final BoatRepository boatRepository;
   
    @Override
public BasicResponse<BoatResponse> getAllUser() {
    List<Boat> users = boatRepository.findAll();

    List<BoatResponse> boatResponses = users.stream()
        .map((Boat boat) -> BoatResponse.builder()
              .id(boat.getId())
              .boatname(boat.getBoatname()) 
              .boatimage(boat.getBoatimage())
              .boatlocation(boat.getBoatlocation())
              .boatavailable(2)
              .price(boat.getPrice())
              .build())
        .collect(Collectors.toList());

    return BasicResponse.<BoatResponse>builder()
        .message("User Data fetched")
        .data(boatResponses)
        .build();
}

        @SuppressWarnings("null")
    @Override
    public BoatResponse createBoat(BoatRequest request) {
        var book = Boat.builder()
        .id(request.getId())
        .boatname(request.getBoatname()) 
        .boatimage(request.getBoatimage())
        .boatlocation(request.getBoatlocation())
        .boatavailable(3)
        .price(request.getPrice())
        .build();
        boatRepository.save(book);
        return BoatResponse.builder()  
        .message("Boat Booked sucessfully")  
                .build();
    }

}
