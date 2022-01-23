package com.azhaguvel.project.appointment.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AppResponse <T>{
    private String status;
    private String message;
    private T body;



}
