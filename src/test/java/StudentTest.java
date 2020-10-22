import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student studentOne, studentTwo;

    @Before
    public void setUp(){
        studentOne = new Student(1L, "Roger");
        studentTwo = new Student(2L, "Ray");
    }

    // make sure we can create a basic instance of the class
    @Test
    public void testCreateStudentInstance(){
        Student fer = new Student(1L, "Fer");
        Student douglas = new Student(2L, "Douglas");
        assertNotNull(fer);
        assertNotNull(douglas);
    }

    @Test
    public void testIfIdIsSet(){
        assertEquals(1 , studentOne.getId(), 0);
        assertNotEquals(2, studentOne.getId(), 0);
    }

    @Test
    public void testIfNameIsSet(){
        assertEquals("Roger", studentOne.getName());
    }

    @Test
    public void testIfGradesArrayExists(){
        assertNotNull(studentOne.getGrades());
        assertNotNull(studentTwo.getGrades());
    }

    @Test
    public void testAddGrade(){
        assertEquals("Student grades are empty at start", studentOne.getGrades().size(), 0);
        studentOne.addGrade(100);
        assertEquals("Student grade added successfully", studentOne.getGrades().size(), 1);
        assertNotEquals("Student grade size not 0 after add", studentOne.getGrades().size(), 0);
        assertEquals("Grade value added matches expectation [POS]",100, studentOne.getGrades().get(0), 0);
        assertNotEquals("Grade value added matches expectation [NEG]", 50, studentOne.getGrades().get(0), 0);
    }

    @Test
    public void testAverageGrade(){
        studentOne.addGrade(80);
        studentOne.addGrade(60);
        assertEquals(70, studentOne.getGradeAverage(), 0);
    }
}
