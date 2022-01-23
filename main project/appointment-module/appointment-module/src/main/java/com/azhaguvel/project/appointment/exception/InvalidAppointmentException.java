package com.azhaguvel.project.appointment.exception;

import com.azhaguvel.project.appointment.dto.AppointmentDto;

public class InvalidAppointmentException extends RuntimeException {
    public InvalidAppointmentException(String message){ super (message); }
}
