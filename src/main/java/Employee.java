public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private int ID;
    private int salary;

    public Employee(String firstName,String lastName,int age,float salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
