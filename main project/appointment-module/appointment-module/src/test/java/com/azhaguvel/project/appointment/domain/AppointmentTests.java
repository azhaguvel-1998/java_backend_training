package com.azhaguvel.project.appointment.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.LocalDate;


public class AppointmentTests {
    @DisplayName("Domain : Checking Object Creation")
    @Test
    void testObjectGettersSetters() {
        var appointment = new Appointment();
        appointment.setType("tb");
        appointment.setId(25L);
        appointment.setPlaced(LocalDate.of(2021, 1, 1));
        appointment.setAppointment(LocalDate.of(2021, 03, 15));
        appointment.setDoctorName("abc");
        Assertions.assertEquals(25, appointment.getAppointment());
        Assertions.assertEquals(
                Date.valueOf(LocalDate.of(2021, 1, 1)),
                appointment.getAppointment()
        );
        Assertions.assertEquals("abc" , appointment.getDoctorName());
        Assertions.assertEquals(25, appointment.getId());


    }


}
