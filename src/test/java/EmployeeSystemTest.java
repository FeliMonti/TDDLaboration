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
        Employee newEmployee1 = new Employee("Samantha","Tester", 33, 40000);
        testObject.addNewEmployee(newEmployee1);
        Employee newEmployee2 = new Employee("Mary","Poppin", 40, 50000);
        testObject.addNewEmployee(newEmployee2);
        System.out.println(newEmployee.getFirstName()); // alternativ newEmployed.forEach(value -> System.out.println(value.getFirstName()));
        System.out.println(newEmployee1.getFirstName());
        System.out.println(newEmployee2.getFirstName());
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
        System.out.println(" ");
        System.out.println(newEmployed.get(1).getFirstName());
        }

    @Test
    public void yearlySalaryIncrementTest(){
        Employee newEmployee = new Employee("Samantha","Tester", 33, 40000);
        testObject.addNewEmployee(newEmployee);
        Employee newEmployee1 = new Employee("Mary","Poppin", 40, 50000);
        testObject.addNewEmployee(newEmployee1);
        Employee newEmployee2 = new Employee("Tim","Tom",35,35000);
        testObject.addNewEmployee(newEmployee2);
        ArrayList<Employee> newEmployed = testObject.getNewEmployee();
        testObject.yearlySalaryIncrement(10);
        assertEquals(38500,newEmployed.get(2).getSalary());

    }

    @Test
    public void individualSalaryRaiseTest(){
        Employee newEmployee = new Employee("Samantha","Tester", 33, 40000);
        testObject.addNewEmployee(newEmployee);
        Employee newEmployee1 = new Employee("Mary","Poppin", 40, 50000);
        testObject.addNewEmployee(newEmployee1);
        Employee newEmployee2 = new Employee("Tim","Tom",35,35000);
        testObject.addNewEmployee(newEmployee2);
        ArrayList<Employee> newEmployed = testObject.getNewEmployee();
        testObject.individualSalaryRaise(10,newEmployee.getID()); // ID = 1 ??r h??rdkodat (icke bra)
        assertEquals(44000,newEmployed.get(0).getSalary());

    }
}


