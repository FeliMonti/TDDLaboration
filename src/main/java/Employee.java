public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private int ID;
    private int salary;

    public Employee(String firstName,String lastName,int age,int ID,int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ID = ID;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }
}
