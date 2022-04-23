package com.edu1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hiblaptop")
public class Laptop 
{
	@Id
	private int lid;
	private String Lname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", Lname=" + Lname + "]";
	}
	

}
