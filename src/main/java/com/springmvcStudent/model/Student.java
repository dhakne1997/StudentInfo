package com.springmvcStudent.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stujpa")
public class Student {
@Id
	private Long roll_no;
	private String stu_firstname;
	private String stu_lastname;
	private String address;
	private int age;
	private String depname;
	private String dep_hodname;
	private Long stu_mo_no;
	private int addmision_year;
	private int passout_year;
	public Long getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(Long roll_no) {
		this.roll_no = roll_no;
	}
	public String getStu_firstname() {
		return stu_firstname;
	}
	public void setStu_firstname(String stu_firstname) {
		this.stu_firstname = stu_firstname;
	}
	public String getStu_lastname() {
		return stu_lastname;
	}
	public void setStu_lastname(String stu_lastname) {
		this.stu_lastname = stu_lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public String getDep_hodname() {
		return dep_hodname;
	}
	public void setDep_hodname(String dep_hodname) {
		this.dep_hodname = dep_hodname;
	}
	public Long getStu_mo_no() {
		return stu_mo_no;
	}
	public void setStu_mo_no(Long stu_mo_no) {
		this.stu_mo_no = stu_mo_no;
	}
	public int getAddmision_year() {
		return addmision_year;
	}
	public void setAddmision_year(int addmision_year) {
		this.addmision_year = addmision_year;
	}
	public int getPassout_year() {
		return passout_year;
	}
	public void setPassout_year(int passout_year) {
		this.passout_year = passout_year;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Long roll_no, String stu_firstname, String stu_lastname, String address, int age, String depname,
			String dep_hodname, Long stu_mo_no, int addmision_year, int passout_year) {
		super();
		this.roll_no = roll_no;
		this.stu_firstname = stu_firstname;
		this.stu_lastname = stu_lastname;
		this.address = address;
		this.age = age;
		this.depname = depname;
		this.dep_hodname = dep_hodname;
		this.stu_mo_no = stu_mo_no;
		this.addmision_year = addmision_year;
		this.passout_year = passout_year;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", stu_firstname=" + stu_firstname + ", stu_lastname=" + stu_lastname
				+ ", address=" + address + ", age=" + age + ", depname=" + depname + ", dep_hodname=" + dep_hodname
				+ ", stu_mo_no=" + stu_mo_no + ", addmision_year=" + addmision_year + ", passout_year=" + passout_year
				+ "]";
	}
	
}