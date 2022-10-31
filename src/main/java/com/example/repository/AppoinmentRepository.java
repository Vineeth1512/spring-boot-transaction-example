package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Appointment;

public interface AppoinmentRepository extends JpaRepository<Appointment, Long> {

}
