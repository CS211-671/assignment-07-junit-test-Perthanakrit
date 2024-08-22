    package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    ArrayList<Student> studentList;

    @BeforeEach
    void setUp() {
        studentList = new ArrayList<>();
    }

    @Test
    void addNewStudent() {
        Student s1 = new Student("66xxxxxxx", "s1");
        Student s2 = new Student("66xxxxxxx", "s2");
        studentList.add(s1);
        studentList.add(s2);

        assertEquals(2, studentList.size());
    }

    @Test
    void findStudentById() {
    }

    @Test
    void giveScoreToId() {
    }

    @Test
    void viewGradeOfId() {
    }

    @Test
    void getStudents() {
    }
}