import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class saveStudentTest {
    private StudentManager studentManager;

    @BeforeEach
    void setUp() {
        studentManager = new StudentManager();
    }

    @Test
    public void testSaveStudent() {
        studentManager.saveStudent("102", "Rupert Pupkin", "32", "st102@gmail.com", "Software development");
        assertEquals(1, studentManager.students[0].size());
        assertEquals("102", studentManager.students[0].get(0));
        assertEquals("Rupert Pupkin", studentManager.students[1].get(0));
        assertEquals("32", studentManager.students[2].get(0));
        assertEquals("st102@gmail.com", studentManager.students[3].get(0));
        assertEquals("Software development", studentManager.students[4].get(0));
    }
    @Test
    void testSearchStudent() {
        studentManager.saveStudent("102","Rupert Pupkin", "32","st102@gmail.com", "Software development");

        studentManager.searchStudent("102");
    }
    @Test
    void testDeleteStudent() {
        studentManager.saveStudent("102","Rupert Pupkin", "32","st102@gmail.com", "Software development");
        studentManager.deleteStudent("102");

        assertTrue(studentManager.students[0].isEmpty());
    }

    }

