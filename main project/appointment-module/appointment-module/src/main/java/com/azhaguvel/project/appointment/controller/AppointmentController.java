package com.azhaguvel.project.appointment.controller;


import com.azhaguvel.project.appointment.domain.Appointment;
import com.azhaguvel.project.appointment.dto.AppResponse;
import com.azhaguvel.project.appointment.dto.AppointmentBetweenDto;
import com.azhaguvel.project.appointment.dto.AppointmentDto;
import com.azhaguvel.project.appointment.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RequestMapping("/Appointment")
@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @PostMapping
    public ResponseEntity<AppResponse<AppointmentDto>> createAppointment(@RequestBody AppointmentDto dto) {
        var svObj = service.createAppointment(dto);
        var response = new AppResponse<AppointmentDto>();
        response.setStatus("success");
        response.setMessage("Appointment saved successfully");
        response.setBody(svObj);
        return ResponseEntity.ok(response);
    }
    @PutMapping("/setAppoint")
    public ResponseEntity<AppResponse<LocalDate>> activate(@Valid @RequestBody AppointmentDto dto) {
        LocalDate stat = service.setAppointment(dto.getId(),dto.getAppointment());
        var response = new AppResponse<LocalDate>();
        response.setMessage("Account Activated");
        response.setStatus("success");
        response.setBody(stat);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
    @PutMapping("/cancelAppoint")
    public ResponseEntity<AppResponse<String>> cancelAppointment(@Valid @RequestBody AppointmentDto dto) {
        String stat = service.cancelAppointment(dto.getId());
        var response = new AppResponse<String>();
        response.setMessage("Appointment is removed");
        response.setStatus("success");
        response.setBody(stat);
        return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
    @GetMapping("/show")
    public List<Appointment> findAllAppointment() {
        return service.findAllApp();
    }

    @GetMapping("/between")
    public ResponseEntity<AppResponse<List<AppointmentDto>>> findbetween(@RequestBody AppointmentBetweenDto dto){
        var response=new AppResponse<List<AppointmentDto>>();
        response.setStatus("success");
        response.setMessage("List of appointments ");
        response.setBody(service.getAppointmentDateBetweenAndType(dto.getStart(),dto.getEnd(),dto.getType()));
        return  ResponseEntity.ok(response);
    }



}
