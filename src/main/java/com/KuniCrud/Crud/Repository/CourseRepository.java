package com.KuniCrud.Crud.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.KuniCrud.Crud.Entity.Course;

import java.io.Serializable;


@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{

}
