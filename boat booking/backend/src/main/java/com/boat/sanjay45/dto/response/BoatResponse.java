package com.boat.sanjay45.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
  

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoatResponse {
    private String message;
    private String id;
    private String boatname;
    private String boatimage;
    private String boatlocation;
    private Integer boatavailable;
    private Double price;

}
