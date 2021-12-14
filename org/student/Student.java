package org.student;

import org.department.Department;

public class Student extends Department{


	public void studentName(){
	
	System.out.println("studentName class c");
	}
	
	public void studentDept(){
		
		System.out.println("studentDept class C ");
		}
	public void studentId(){
		
		System.out.println("studentId class c");
		}
	
	
	public static void main(String[] args) {
		
		
		Student std = new Student();
		std.studentName();
		std.studentDept();
		std.studentId();
		std.deptName();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		
}

	
}
