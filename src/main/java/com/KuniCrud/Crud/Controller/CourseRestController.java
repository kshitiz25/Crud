package com.KuniCrud.Crud.Controller;

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

import com.KuniCrud.Crud.Entity.Course;
import com.KuniCrud.Crud.Entity.CourseRequestBody;
import com.KuniCrud.Crud.Service.CourseService;

@RestController
public class CourseRestController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody CourseRequestBody course){
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status , HttpStatus.CREATED);
	}
	
	@GetMapping("/course/{id}")
	public ResponseEntity<Course>getCourse(@PathVariable Integer id){
		Course course = courseService.getById(id);
		return new ResponseEntity<>(course , HttpStatus.OK);
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> allCourses = courseService.getAllCourse();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
	}
	
	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody CourseRequestBody course){
		String status = courseService.upsert(course);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@DeleteMapping("/course/{id}")
	public ResponseEntity<String>deleteCourse(@PathVariable Integer id){
		String status = courseService.deleteById(id);
		return new ResponseEntity<>(status , HttpStatus.OK);
	}
	
}
