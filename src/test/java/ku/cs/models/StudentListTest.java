    package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void setUp() {
        studentList = new StudentList();
    }

    @Test
    void addNewStudent() {
        studentList.addNewStudent("66xxxxxx1", "s1");
        studentList.addNewStudent("66xxxxxx2", "s2");

        assertEquals(2, studentList.getStudents().size());
    }

    @Test
    void findStudentById() {
        studentList.addNewStudent("66xxxxxx1", "s1");
        studentList.addNewStudent("66xxxxxx2", "s2");

        String actual = "66xxxxxx2";
        String expected = studentList.findStudentById("66xxxxxx2").getId();
        assertEquals(expected, actual);
    }

    @Test
    void giveScoreToId() {
        studentList.addNewStudent("66xxxxxx1", "s1", 50);
        studentList.addNewStudent("66xxxxxx2", "s2", 55);

        String userId = studentList.getStudents().get(1).getId();
        studentList.giveScoreToId(userId, 11.11);

        assertEquals(66.11, studentList.findStudentById(userId).getScore());
    }

    @Test
    void viewGradeOfId() {
        studentList.addNewStudent("66xxxxxx1", "s1", 50);
        studentList.addNewStudent("66xxxxxx2", "s2", 55);

        String userId = studentList.getStudents().get(0).getId();
        String grade = studentList.viewGradeOfId(userId);

        assertEquals("D", grade);
    }

    @Test
    void getStudents() {
        studentList.addNewStudent("66xxxxxx1", "s1", 50);
        studentList.addNewStudent("66xxxxxx2", "s2", 55);
        studentList.addNewStudent("66xxxxxx3", "s3", 60);

        String students = "[{id: '66xxxxxx1', name: 's1', score: 50.0}, " +
                            "{id: '66xxxxxx2', name: 's2', score: 55.0}, " +
                            "{id: '66xxxxxx3', name: 's3', score: 60.0}]";

        assertEquals(students, studentList.getStudents().toString());
    }

    @Test
    void getStudentByObject()
    {
        studentList.addNewStudent("66xxxxxx1", "s1", 50);

        Student s1 = new Student("66xxxxxx1", "s1", 50);
        assertEquals(s1, studentList.findStudentByObject(s1));
    }
}