package com.springREST.RestAPI.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springREST.RestAPI.entities.Courses;
import com.springREST.RestAPI.services.CourseService;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		
		return "Welcome to home page";
	}
	
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		
		return this.courseService.getCousrses();
		
	}
	
	@GetMapping("/time")
	public String getTime(){
		 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime now=LocalDateTime.now();
		
		//return "Current time is : 01-01-2000" ;
		return dtf.format(now);	
		
	}
	
	@GetMapping("/dateTime")
	public HashMap<String, String> dateAndTime() {
	HashMap<String,String> date=new HashMap<String,String>();
	date.put("Time", getTime());
	return date;
	
	}
}
