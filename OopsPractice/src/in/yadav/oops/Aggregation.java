package in.yadav.oops;
/* 
 * 2.Write a program that achieves the Aggregation  oop's concepts.
 * 
 * @author  :  Ritesh Yadav
 *  @version :  1.0
 *  @since   :  28-03-2020
 * */
import java.util.ArrayList;
import java.util.List;

class Student {
	String student_name;
	int student_id;
	String student_dept;

	public Student(String student_name, int student_id, String student_dept) {
		super();
		this.student_name = student_name;
		this.student_id = student_id;
		this.student_dept = student_dept;
	}
}

class Department {

	String department_name;
	private List<Student> students;

	Department(String name, List<Student> students) {

		this.department_name = name;
		this.students = students;

	}

	public List<Student> getStudents() {
		return students;
	}
}
class Institute {

	String instituteName;
	private List<Department> departments;

	Institute(String instituteName, List<Department> departments) {
		this.instituteName = instituteName;
		this.departments = departments;
	}

	// count total students of all departments in a given institute
	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		for (Department dept : departments) {
			students = dept.getStudents();
			for (Student s : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}

}

class Aggregation {
	public static void main(String[] args) {
		Student student1 = new Student("Ritesh", 1, "MCA");
		Student student2 = new Student("Raj", 2, "MCA");
		Student student3 = new Student("Sudeep", 1, "EE");
		Student student4 = new Student("Durga", 2, "EE");

		// making a List of MCA Students.
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(student1);
		cse_students.add(student2);

		// making a List of EE Students
		List<Student> ee_students = new ArrayList<Student>();
		ee_students.add(student3);
		ee_students.add(student4);

		Department CSE = new Department("MCA", cse_students);
		Department EE = new Department("EE", ee_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);

		// creating an instance of Institute.
		Institute institute = new Institute("RGPV", departments);

		System.out.print("Total students in institute: ");
		System.out.print(institute.getTotalStudentsInInstitute());
	}
}