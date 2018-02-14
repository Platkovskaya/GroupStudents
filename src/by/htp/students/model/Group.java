package by.htp.students.model;

public class Group {

	public String groupName;

	private Student[] students;
	int studentsCount;

	public Group(String name) {
		this.groupName = name;
	}

	public void setStudentsGroup(Student[] students) {
		if (students != null) {
			this.students = students;
		}
	}

	public Student[] getStudentsGroup() {
		return students;
	}

	public void addStudentsGroup(Student student) {
		if (this.students != null) {
			if (studentsCount < students.length) {
				students[studentsCount] = student;
				studentsCount++;
			} else {
				Student[] students = new Student[this.students.length + 10];
				for (int i = 0; i < students.length; i++) {
					students[i] = this.students[i];
				}
				this.students = students;
				this.students[studentsCount] = student;
				studentsCount++;
			}

		} else {
			this.students = new Student[10];
			this.students[0] = student;
			studentsCount++;
		}
	}

}
