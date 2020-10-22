import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student studentOne, studentTwo;

    @Before
    public void setUp(){
        studentOne = new Student(1, "Roger");
        studentTwo = new Student(2, "Ray");

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
    }
}
