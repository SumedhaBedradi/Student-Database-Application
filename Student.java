package StudentDatabaseApplication;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String course;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Constructor
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter student last name: ");
		String lastName = sc.nextLine();

		System.out.println("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		setStudentID();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

	}

	private void setStudentID() {
		id++;
		this.studentId = gradeYear + "" + id;

	}

	public void enroll() {
		do {
			System.out.println("Enter course to enroll(Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (course.equals("Q")) {
				course = course + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				System.out.println("BREAK!");
				break;
			}
		} while (1 != 0);
		System.out.println("ENROLLED IN: " + course);
		System.out.println("TUTION BALANCE: " + tuitionBalance);
	}

	// view balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);

	}

	// pay tuition
	public void payTuition() {
		viewBalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your payment");
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);

	}

	// Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level:" + gradeYear + "Student ID:" + studentId
				+ "\nCourses Enrolled:" + course + "\nBalance: $" + tuitionBalance;
	}

}
