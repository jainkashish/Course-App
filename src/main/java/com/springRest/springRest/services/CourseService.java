package com.springRest.springRest.services;

import java.util.List;

import com.springRest.springRest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long courseID);
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public void deleteCourse(long parseLong);
}
