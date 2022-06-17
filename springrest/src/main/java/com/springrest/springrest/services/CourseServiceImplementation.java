package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImplementation implements CourseService {
	
	List<Course> list;
	
	
	
	public CourseServiceImplementation() {
		list = new ArrayList <> ();
		list.add(new Course(145,"Java Core Course", "This course contains  basic of Java."));
		list.add(new Course(4343,"spring boot course","creating rest api using spring boot"));
		
		
	}

	

	@Override
	public List<Course> getCourses(){
		return list;
	}
	
	

}
