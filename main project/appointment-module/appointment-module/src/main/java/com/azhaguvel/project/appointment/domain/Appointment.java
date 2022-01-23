package com.azhaguvel.project.appointment.domain;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@Data
@Entity
@Table(name = "apmt")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @NotNull
    @Column(unique = false, nullable = false)
    private String type;

    @Column(unique = false, nullable = true)
    private LocalDate placed;

    @Column(unique = false, nullable = false)
    private LocalDate appointment;

    @NotNull
    @Column(unique = false, nullable = false)
    private String doctorName;

}
