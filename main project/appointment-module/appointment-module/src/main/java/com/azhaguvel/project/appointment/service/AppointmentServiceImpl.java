package com.azhaguvel.project.appointment.service;


import com.azhaguvel.project.appointment.domain.Appointment;
import com.azhaguvel.project.appointment.dto.AppointmentDto;
import com.azhaguvel.project.appointment.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public  class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    public AppointmentRepository repository;

    @Override
    public AppointmentDto createAppointment(AppointmentDto dto) {
        var appointment = new Appointment();
        appointment.setType(dto.getType());
        appointment.setId(dto.getId());
        appointment.setAppointment(dto.getAppointment());
        appointment.setPlaced(dto.getPlaced());
        appointment.setDoctorName(dto.getDoctorName());

        repository.save(appointment);
        return dto;
    }

    @Override
    public LocalDate setAppointment(Long id, LocalDate appointment) {
        Optional<Appointment> op = repository.findById(id);
        Appointment baOld = op.orElseThrow();
        LocalDate existingAppointment = baOld.getAppointment();
        LocalDate newAppointment = appointment;
        Appointment baNew = new Appointment();
        baNew.setAppointment(appointment);
        baNew.setId(baOld.getId());
        baNew.setType(baOld.getType());
        baNew.setPlaced(baOld.getPlaced());
        baNew.setDoctorName(baOld.getDoctorName());
        repository.save(baNew);
        return baNew.getAppointment();
    }

    @Override
    public String cancelAppointment(Long id) {
        Appointment op = repository.getById(id);
        String existingType = op.getType();
        String newType = "cancel";
        op.setType(newType);
        repository.save(op);
        return op.getType();

    }

    @Override
    public List<Appointment> findAllApp() {
        return repository.findAll();
    }

    @Override
    public List<AppointmentDto> getAppointmentDateBetweenAndType(LocalDate start, LocalDate end,String type) {
        List<Appointment> app = repository.findByAppointmentBetweenAndType(start, end, type);
        List<AppointmentDto> appdto = new ArrayList<>();
        for (int i = 0; i < app.size(); i++) {
            Appointment apps = app.get(i);
            AppointmentDto dto = new AppointmentDto(
                    apps.getId(),
                    apps.getType(),
                    apps.getPlaced(),
                    apps.getAppointment(),
                    apps.getDoctorName()

            );
            appdto.add(dto);
        }
        return appdto;


    }
}
