package com.springmvcStudent.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcStudent.dao.StudentDao;
import com.springmvcStudent.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
private StudentDao studentdao;	
	
	 
	@Override
	public List<Student> getStudent() {
		return studentdao.findAll();
	}

	
//	//get
//	@Override
//	public Student getStudent(long studentId) {
//		
//		return studentdao.getOne(studentId);
//	
//	}
//	
	 
	

	//add student details
	
	@Override
	public Student addStudent(Student student) {
		studentdao.save(student);
		return student;
	}

            //update student

	@Override
	public Student updateStudent(Student student) {
studentdao.save(student);
		return student;
	}

}
