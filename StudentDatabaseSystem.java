package StudentDatabaseApplication;

import java.util.Scanner;

public class StudentDatabaseSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]

		// ask how many new Students we want to add
		System.out.println("Enter number of new students to enroll:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			Student st = new Student();
			st.enroll();
			st.payTuition();
			System.out.println(students[n].toString());

		}

	}

}
