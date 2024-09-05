package com.KuniCrud.Crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KuniCrud.Crud.Entity.Course;
import com.KuniCrud.Crud.Entity.CourseRequestBody;
import com.KuniCrud.Crud.Repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(CourseRequestBody courseRequestBody) {
		
		Course course = new Course();
		course.setEmployeeName(courseRequestBody.getEmployeeName());
		course.setEmployementType(courseRequestBody.getEmployementType());
		course.setSalary(courseRequestBody.getSalary());
		course.setDesignation(courseRequestBody.getDesignation());
		courseRepo.save(course);
		return "success";
	}

	@Override
	public Course getById(Integer id) {
			
		Optional<Course> findById = courseRepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}
	
	@Override
	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		if(courseRepo.existsById(id)) {
			courseRepo.deleteById(id);
			return "Delete Success";
		}else {
		return "No Record Found";
		}
	}

}
