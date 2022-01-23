package com.azhaguvel.project.appointment.repository;


import com.azhaguvel.project.appointment.domain.Appointment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;


@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AppointmentRepositoryTests {

    @Autowired
    private AppointmentRepository repository;


    @DisplayName("Appointment Repository : Creating Appointment")
    @Test
    public void testCreateAppointment() {

        var appointment = new Appointment();
        appointment.setId(1L);
        appointment.setType("hiv");
        appointment.setPlaced(LocalDate.now());
        appointment.setAppointment(LocalDate.now());
        appointment.setDoctorName("ddd");

        repository.save(appointment);
    }
}
