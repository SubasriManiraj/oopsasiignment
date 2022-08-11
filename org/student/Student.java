package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Subasri M");
	}
	public void studentDepartment() {
		System.out.println("Electrical Electronics Engineering");
	}
	public void studentId() {
		System.out.println("220005059");
	}
public static void main(String[] args) {
	Student details=new Student();
	details.collegeName();
	details.collegeCode();
	details.collegeRank();
	details.departmentName();
	details.studentName();
	details.studentDepartment();
	details.studentId();
}
}
