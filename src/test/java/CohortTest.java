import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort bio;
    Student fer;
    Student douglas;
    Student daniel;

    @Before
    public void setUp(){
        bio = new Cohort();
        fer = new Student(1L, "Fer");
        douglas = new Student(2L, "Douglas");
        daniel = new Student(3L, "Daniel");

    }

    @Test
    public void testCreateCohort(){
        assertNotNull(bio);
    }

    @Test
    public void testAddAndGetStudent(){
        bio.addStudent(fer);
        assertTrue("Cohort size is one after add method", bio.getStudents().size() == 1);
        bio.addStudent(douglas);
        bio.addStudent(daniel);
        assertEquals("Cohort size is 3 after 3 student adds",3, bio.getStudents().size());
    }

    @Test
    public void testGetCohortAverage(){
        bio.addStudent(fer);
        bio.addStudent(douglas);
        bio.addStudent(daniel);
        fer.addGrade(100);
        douglas.addGrade(79);
        daniel.addGrade(84);
        assertEquals(87.7, bio.getCohortAverage(), .1);
    }

    @Test
    public void testFindStudentByID(){
        bio.addStudent(fer);
        bio.addStudent(daniel);
        assertEquals("Fer", bio.findStudentById(1L));
        assertNotEquals("Douglas", bio.findStudentById(3L));
    }
}
