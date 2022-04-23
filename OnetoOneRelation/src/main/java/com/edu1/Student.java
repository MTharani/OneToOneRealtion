package com.edu1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hibstudent")
public class Student
{
	@Id
	private  int rollno;
	private String name;
	private int mark;
	@OneToOne
	Laptop lp;
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
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public Laptop getLp() {
		return lp;
	}
	public void setLp(Laptop lp) {
		this.lp = lp;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + ", lp=" + lp + "]";
	}
     


}
