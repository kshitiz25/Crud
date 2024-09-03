package com.KuniCrud.Crud.Service;

import java.util.List;

import com.KuniCrud.Crud.Entity.Course;
import com.KuniCrud.Crud.Entity.CourseRequestBody;

public interface CourseService {
	
public String upsert(CourseRequestBody courseRequestBody);
public Course getById(Integer id );
public List<Course> getAllCourse();
public String deleteById(Integer id);
}
