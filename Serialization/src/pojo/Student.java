package pojo;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	String gender;
	Integer marks;
	
	public Student() {
		super();
	}

	public Student(String name, String gender, Integer marks) {
		super();
		this.name = name;
		this.gender = gender;
		this.marks = marks;
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

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	public void displayStudent()
	{
		System.out.println("Student Details:");
		System.out.println("Name: " + this.getName());
		System.out.println("Gender: " + this.getGender());
		System.out.println("Marks: " + this.getMarks());
		
	}
	

}
