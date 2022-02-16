import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EmployeeSystemTest {

    private EmployeeSystem employeeSystem;

    EmployeeSystem testObject;

    @BeforeEach
    public void beforeEach(){
        testObject = new EmployeeSystem();     //TestObject = EmployeeSystem
    }

    @Test
    public void addNewEmployeeTest(){
        Employee newEmployee = new Employee("Tim","Tom",35,35000);
        testObject.addNewEmployee(newEmployee);

    }
}
