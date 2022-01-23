package com.azhaguvel.project.appointment.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Setter
@Getter
public class AppointmentBetweenDto {

    private LocalDate start;
    private LocalDate end;
    private String type;

}
