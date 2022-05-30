package week3.day1;

import week2.day1.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Sampath kumar");
	}
	
    public void studentDept() {
		
		System.out.println("Selenium");
	}
    
    public void studentId() {
		
		System.out.println("JCE 123");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ST = new Student();
		
		ST.collegeName();
		
		ST.collegeCode();
		
		ST.collegeRank();
		
		ST.deptName();
		
		ST.studentName();
		
		ST.studentDept();
		
		ST.studentId();

	}

}
