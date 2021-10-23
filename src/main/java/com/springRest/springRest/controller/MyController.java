package com.springRest.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.springRest.entities.Course;
import com.springRest.springRest.services.CourseService;


@RestController
public class MyController {
	
	@Autowired
	private CourseService CourseServiceObj ;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Courses Application" ;
	}
	
	@GetMapping("/Courses")
	public List<Course> getCourses()
	{	
		return this.CourseServiceObj.getCourses();
	}
	@GetMapping("/Courses/{CourseId}")
	public Course getCourse(@PathVariable String CourseId )
	{	
		return this.CourseServiceObj.getCourse(Long.parseLong(CourseId));
	}
	@PostMapping("/Courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.CourseServiceObj.addCourse(course) ;
	}
	@PutMapping("/Courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.CourseServiceObj.updateCourse(course) ;
	}
	@DeleteMapping("/Courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
		try {
			this.CourseServiceObj.deleteCourse(Long.parseLong(courseId)) ;
			return new ResponseEntity<>(HttpStatus.OK) ;
		}
		catch( Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
	}
}
