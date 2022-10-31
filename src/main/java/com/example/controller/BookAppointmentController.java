package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.BookAppointmentService;

@RestController
public class BookAppointmentController {

	@Autowired
	private BookAppointmentService book;

	@PostMapping("/book")
	public String bookApponitment(AppointmentFormDTO app) {

		return book.bookApponitment(app);
	}

}
