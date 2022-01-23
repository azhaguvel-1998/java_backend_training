package com.azhaguvel.project.appointment.service;

import com.azhaguvel.project.appointment.domain.Appointment;
import com.azhaguvel.project.appointment.dto.AppointmentDto;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentService {
    public AppointmentDto createAppointment(AppointmentDto dto);

    LocalDate setAppointment(Long id, LocalDate appointment);

    String cancelAppointment(Long id);

    List<Appointment> findAllApp();

   List<AppointmentDto> getAppointmentDateBetweenAndType(LocalDate start, LocalDate end, String type);


}
