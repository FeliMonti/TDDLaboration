import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    Employee testObject;
    Employee testObject2;

    @BeforeEach
    public void beforeEach(){
        testObject = new Employee("Feli","Monti",25,38000);
        testObject2 = new Employee("Nalle","Puh",25,50000);
    }
    @Test
    public void getFirstNameTest(){             //att testa getter, måste man har antingen en
        String actual = testObject.getFirstName(); //set metod eller en konstruktor, om man ska testa
        assertEquals("Feli",actual);    //en setter då måste man ha en get metod i klassen
    }
    @Test
    public void setFirstNameTest(){
        String myFirstName = "Tiger";
        testObject.setFirstName(myFirstName);
        assertEquals(myFirstName,testObject.getFirstName());
        System.out.println(testObject.getFirstName());
    }

    @Test
    public void getLastNameTest(){
        String actual = testObject.getLastName();
        assertEquals("Monti",actual);
    }

    @Test
    public void setLastNameTest(){
        String myLastName = "Loo";
        testObject.setLastName(myLastName);
        assertEquals(myLastName,testObject.getLastName());
        // System.out.println(testObject.getLastName());
    }

    @Test
    public void getAgeTest(){
        int actual = testObject.getAge();
        assertEquals(25,actual);
    }

    @Test
    public void setAgeTest(){
        int myAge = 45;
        testObject.setAge(myAge);
        assertEquals(myAge,testObject.getAge());
    }

    @Test
    public void getIDTest(){
        Employee testObject = new Employee("Feli","Monti",25,38000);
        Employee testObject2 = new Employee("Minnie","Mouse",22,28000);
        int actual = testObject2.getID();
        int expected = testObject.getID()+1;
        assertEquals(expected,actual);
    }

    @Test
    public void getIDIncrementTest(){
        int actual = testObject2.getID();
        assertNotEquals(testObject.getID(),actual);
    }

    @Test
    public void getSalaryTest(){
        float actual = testObject.getSalary();
        assertEquals(38000,actual);
    }

    @Test
    public void setSalaryTest(){
        float mySalary = 36000;
        testObject.setSalary(mySalary);
        assertEquals(mySalary,testObject.getSalary());
    }
}
