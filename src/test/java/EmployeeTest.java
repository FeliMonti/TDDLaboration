import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee employee;

    Employee testObject;

    @BeforeEach
    public void beforeEach(){
        testObject = new Employee();
    }

    @Test
    public void getFirstNameTest(){
        String actual = testObject.getFirstName();
        assertEquals("Felicia",actual);
    }

}
