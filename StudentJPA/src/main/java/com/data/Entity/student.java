package com.data.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int rollno;
	String name;
	String course;

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(int rollno, String name, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}

