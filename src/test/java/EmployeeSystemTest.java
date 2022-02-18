import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class EmployeeSystemTest {

    EmployeeSystem testObject;

    @BeforeEach
    public void beforeEach(){
        testObject = new EmployeeSystem();     //TestObject = EmployeeSystem
    }

    @Test
    public void addNewEmployeeTest(){
        Employee newEmployee = new Employee("Tim","Tom",35,35000);
        testObject.addNewEmployee(newEmployee);
        System.out.println(newEmployee.getID()); // alternativ newEmployed.forEach(value -> System.out.println(value.getFirstName()));
        ArrayList<Employee> newEmployed = testObject.getNewEmployee();
        assertEquals("Tim",newEmployed.get(0).getFirstName());
        assertEquals("Tom",newEmployed.get(0).getLastName());
        assertEquals(35,newEmployed.get(0).getAge());
        assertEquals(35000,newEmployed.get(0).getSalary());

    }

    @Test
    public void removeEmployeeTest(){
        Employee newEmployee = new Employee("Samantha","Tester", 33, 40000);
        testObject.addNewEmployee(newEmployee);
        Employee newEmployee1 = new Employee("Mary","Poppin", 40, 50000);
        testObject.addNewEmployee(newEmployee1);
        Employee newEmployee2 = new Employee("Tim","Tom",35,35000);
        testObject.addNewEmployee(newEmployee2);
        System.out.println(" ");
        System.out.println(newEmployee.getFirstName());
        System.out.println(newEmployee1.getFirstName());
        System.out.println(newEmployee2.getFirstName());
        ArrayList<Employee> newEmployed = testObject.getNewEmployee();
        testObject.removeEmployee(newEmployee1);
        assertEquals("Tim",newEmployed.get(1).getFirstName());
        }

    @Test
    public void salaryYearlyIncrementTest(){
        double actualIncrement = testObject.salaryYearlyIncrement(10);
        assertEquals(3500,actualIncrement);
    }

    @Test
    public void salaryRaiseByIndividualTest(){
        testObject.salaryRaiseByIndividual();
    }
}


