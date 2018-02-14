package by.htp.main.runner;

import by.htp.students.model.Student;
import by.htp.students.model.Group;

public class MainStudentGroup {

	public static void main(String[] args) {

		Group group1 = new Group("Group1");
		Group group2 = new Group("Group2");
		Group group3 = new Group("Group3");
		Group group4 = new Group("Group4");
		Group group5 = new Group("Group5");

		Student student1 = new Student("Alex");
		Student student2 = new Student("Rob");
		Student student3 = new Student("Jhon");

		group1.addStudentsGroup(student1);

		for (int i = 0; i < group1.getStudentsGroup().length; i++) {
			if (group1.getStudentsGroup()[i] != null) {
				System.out.println(group1.getStudentsGroup()[i].name + "/" + group1.groupName);
			}
		}

	}

}
