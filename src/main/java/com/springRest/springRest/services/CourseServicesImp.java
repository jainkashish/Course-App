package com.springRest.springRest.services;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springRest.springRest.entities.Course;

@Service
public class CourseServicesImp implements CourseService {

	List<Course> list ;
	
	public CourseServicesImp() {
		list = new ArrayList<>() ;
		list.add( new Course( 101, "Java Core Course", "This course contains Basics of Java")) ;
		list.add( new Course( 102, "Advanced Java Course", "This course contains concepts of Advanced Java")) ;
		list.add( new Course( 103, "Python for beginners", "This course contains Basics of Python")) ;
	}
	
	
	@Override
	public List<Course> getCourses() {
		return list ;
	}


	@Override
	public Course getCourse(long courseID) {
		
		Course c = null ;
		for( Course course : list )
		{
			if( course.getId()==courseID )
			{
				c = course ;
				break ;
			}
		}
		
		return c ;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course) ;
		return course ;
	}


	@Override
	public Course updateCourse(Course course) {
		for( Course c: list )
		{
			if( c.getId()==course.getId() )
			{
				c.setTitile(course.getTitile()); 
				c.setDescription(course.getDescription()) ;
				return c ;
			}
		}
		return null ;
	}


	@Override
	public void deleteCourse(long parseLong) {
		list = this.list.stream().filter( e-> e.getId()!=parseLong).collect(Collectors.toList()) ; 
		
	}

}
