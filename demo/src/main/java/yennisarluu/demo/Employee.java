package yennisarluu.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
@Id
int id;
public Employee(int id, String fname, String lname) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public Employee(){}
String fname;
String lname;
}
