package com.springmvcStudent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvcStudent.model.Student;
import com.springmvcStudent.service.StudentService;

@RestController
public class StudentController {
	
@Autowired 
	private StudentService studentservice;
	
	//get StudentDetails

	@GetMapping("/stu")
	public List<Student>getStudent()
	{
		return this.studentservice.getStudent();
		
	}
	
	//student add
	@PostMapping("/stuadd")
public Student addStudent(@RequestBody Student student)
{
		return this.studentservice.addStudent(student);
}
	
	//student update
	
	//update
	
			@PutMapping("/stuupdate")
			public Student updateStudent(@RequestBody Student student)
			{
				return this.studentservice.updateStudent(student);
			}
}
