import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EmployeeSystemTest {

    private EmployeeSystem employeeSystem;

    EmployeeSystem testObject;

    @BeforeEach
    public void beforeEach(){
        employeeSystem = new EmployeeSystem();
    }

    @Test
    public void addNewEmployeeTest(){
        String newEmployee = "Tim";
        testObject.addNewEmployee();

    }
}
