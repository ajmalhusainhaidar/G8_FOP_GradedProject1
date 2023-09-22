package com.greatlearning.java;

class SuperDepartment {
	public String departmentName() {
		return "Welcome to Super Department";
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
}

class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		return "Welcome to Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}

class HrDepartment extends AdminDepartment {
	public String departmentName() {
		return "Welcome to HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}
}

class TechDepartment extends HrDepartment {
	public String departmentName() {
		return "Welcome to Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}
}
