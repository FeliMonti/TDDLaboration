import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        //System.out.println(newEmployee.getID());
        ArrayList<Employee> newEmployed = testObject.getNewEmployee();
        assertEquals("Tim",newEmployed.get(0).getFirstName());
        assertEquals("Tom",newEmployed.get(0).getLastName());
        assertEquals(35,newEmployed.get(0).getAge());
        assertEquals(35000,newEmployed.get(0).getSalary());
        //System.out.println(newEmployee.getFirstName());

        //newEmployed.forEach(value -> System.out.println(value.getFirstName()));
    }
}
