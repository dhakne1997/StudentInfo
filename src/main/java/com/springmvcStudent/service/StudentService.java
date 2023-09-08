package com.springmvcStudent.service;

import java.util.List;

import com.springmvcStudent.model.Student;

public interface StudentService {

	
	public List<Student>getStudent();//method return list

	public Student addStudent(Student student);

	//public Student getStudent(long studentId);

	public Student updateStudent(Student student);
}
