import java.util.ArrayList;

public class EmployeeSystem {

    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void addNewEmployee(Employee newEmployee){
        this.employeeList.add(newEmployee);
    }

    public ArrayList<Employee> getNewEmployee() {
        return employeeList;
    }

    public void removeEmployee(Employee newEmployee) {
        this.employeeList.remove(newEmployee);
    }

    public double salaryYearlyIncrement(double incrementInPercentage) {
        float salary = 35000;
        double newSalary = salary * incrementInPercentage / 100;
        return newSalary;
    }





}
