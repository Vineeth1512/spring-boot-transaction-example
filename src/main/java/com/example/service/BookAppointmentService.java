package com.example.service;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controller.AppointmentFormDTO;
import com.example.model.Appointment;
import com.example.model.Patient;
import com.example.repository.AppoinmentRepository;
import com.example.repository.PatientRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class BookAppointmentService {

	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private AppoinmentRepository appoinmentRepository;

	public String bookApponitment(AppointmentFormDTO app) {

		Patient p = new ObjectMapper().convertValue(app, Patient.class);
		patientRepository.save(p).getPatientId();
		System.out.println(">>>>>> patient saved succesfully !... <<<<<<");
		System.out.println(2 / 0);
		Appointment appointment = Appointment.builder().date(new Date(System.currentTimeMillis())).doctorNo(787l)
				.patientNo(43l).build();
		int app1 = appoinmentRepository.save(appointment).getAppointmentNo();

		return "Appointment booked succesfully" + app1;
	}

}
