package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlstromAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlstromAppApplication.class, args);
		System.out.println("ALSTROM APP STARTED on SUNDAY");
	}
	
	@GetMapping("happyWeekend")
	public String printName() {
		return "Happy weekend Sacchin ";
	}

}
