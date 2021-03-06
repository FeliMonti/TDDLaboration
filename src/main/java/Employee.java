public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private float salary;
    private static int IDCounter; //detta generera en automatisk id nummer och eftersom det
    private int ID;                                //static så kommer den ihåg det id numret som var tidigare

    public Employee(String firstName,String lastName,int age,float salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        IDCounter = IDCounter + 1;
        ID = IDCounter;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }
}
