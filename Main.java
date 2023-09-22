
package com.greatlearning.java;
public class Main {
	public static void main(String[]args) {
		SuperDepartment s1= new SuperDepartment();
			s1.departmentName();
			s1.getTodaysWork();
			s1.getWorkDeadline();
			s1.isTodayAHoliday();
		SuperDepartment s2=new AdminDepartment();
			s2.departmentName();
			s2.getTodaysWork();
			s2.getWorkDeadline();
			System.out.println(s2.departmentName());
			System.out.println(s2.getTodaysWork());
			System.out.println(s2.getWorkDeadline());
			System.out.println(s1.isTodayAHoliday());
			System.out.println("                    ");
		HrDepartment s3=new HrDepartment();
			s3.departmentName();
			s3.getTodaysWork();
			s3.getWorkDeadline();
			s3.doActivity();
			System.out.println(s3.departmentName());
			System.out.println(s3.doActivity());
			System.out.println(s3.getTodaysWork());
			System.out.println(s3.getWorkDeadline());
			System.out.println(s1.isTodayAHoliday());
			System.out.println("                    ");
		TechDepartment s4=new TechDepartment();
		s4.departmentName();
		s4.getTodaysWork();
		s4.getWorkDeadline();
		s4.getTechStackInformation();
		System.out.println(s4.departmentName());
		System.out.println(s4.getTodaysWork());
		System.out.println(s4.getWorkDeadline());
		System.out.println(s4.getTechStackInformation());
		System.out.println(s1.isTodayAHoliday());
		System.out.println("                    ");
		}
		
	}
