package com.azhaguvel.project.appointment.service;

import com.azhaguvel.project.appointment.domain.Appointment;
import com.azhaguvel.project.appointment.dto.AppointmentDto;
import com.azhaguvel.project.appointment.exception.AppointmentAlreadyExisting;
import com.azhaguvel.project.appointment.exception.DateOutBound;
import com.azhaguvel.project.appointment.exception.DuplicateException;

import java.time.LocalDate;
import java.util.List;

public interface AppointmentService {


    AppointmentDto createAppointment(AppointmentDto dto) throws DuplicateException;

    LocalDate setAppointment(Long id, LocalDate appointment, String type) throws DateOutBound, AppointmentAlreadyExisting;

    String cancelAppointment(Long id);

    String updateAppointment(Long id, String type);

    List<Appointment> findAllApp();

    List<AppointmentDto> getDaysBetweenDates(LocalDate start, LocalDate end);
}
