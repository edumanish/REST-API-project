package com.springREST.RestAPI.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springREST.RestAPI.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	
	 List<Courses> courseList;
	

	public CourseServiceImpl() {
		
		courseList = new ArrayList<>();
		courseList.add(new Courses(143,"java course","This is acourse for JAVA"));
		courseList.add(new Courses(153,"python course","This is acourse for PYTHON"));
		courseList.add(new Courses(163,".Net course","This is acourse for .Net"));
	}


	@Override
	public List<Courses> getCousrses() {
		
		return courseList;
	}

}
