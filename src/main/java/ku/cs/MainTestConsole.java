package ku.cs;

import ku.cs.models.Student;
import ku.cs.models.StudentList;

import java.util.HashMap;

public class MainTestConsole {
    public static void main(String[] args) {
        StudentList students = new StudentList();
        students.addNewStudent("11111", "s1");
        students.addNewStudent("22222", "s2");
        students.addNewStudent("33333", "s3");

        Student s1 = new Student("22222", "s1");
        System.out.println(students.findStudentByObject(s1));
        System.out.println(students.findStudentById(s1.getId()));

    }
}
