import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee employee;

    Employee testObject;
    Employee testObject2;

    @BeforeEach
    public void beforeEach(){
        testObject = new Employee("Feli","Monti",25,28000);
        testObject2 = new Employee("Juhee","Kang",25,50000);
    }

    @Test
    public void getFirstNameTest(){             //när man ska testa getter, måste man har antingen en
        String actual = testObject.getFirstName(); //set metod eller en konstruktor, om man ska testa
        assertEquals("Feli",actual);    //en setter då man ha en get metod i klassen
    }

    @Test
    public void getLastNameTest(){
        String actual = testObject.getLastName();
        assertEquals("Monti",actual);
    }

    @Test
    public void getIDTest(){
        int actual = testObject.getID();
        assertEquals(1,actual);

    }

    @Test
    public void getIDIncrementTest(){
        int actual = testObject2.getID();
        assertEquals(2,actual);
        assertNotEquals(testObject.getID(),testObject2.getID());
    }
}
