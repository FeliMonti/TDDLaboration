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

    public double salaryRaise(double raiseInPercentage) {
        float salary = 35000;
        double newRaisedSalary = salary * raiseInPercentage / 100;
        return newRaisedSalary;
    }





}
