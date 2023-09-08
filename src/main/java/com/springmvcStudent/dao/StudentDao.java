package com.springmvcStudent.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvcStudent.model.Student;

public interface StudentDao extends JpaRepository<Student, Long>{


	

}
