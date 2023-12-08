package com.sidhartha.mainmicro.entity;

public class Customer 
{

	
	 private int id;
	 private String name;
	 private String gender;
	 private int age;
	 private String dob;
	 private String location;
	
	 public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String name, String gender, int age, String dob, String location) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.dob = dob;
		this.location = location;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", dob=" + dob
				+ ", location=" + location + "]";
	}	
}