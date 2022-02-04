package com.azhaguvel.project.appointment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AppointmentDto {

    private Long id;
    @NotNull
    @NotBlank
    private String type;
    private LocalDate placed;
    private LocalDate appointment;
    private String doctorName;
}
