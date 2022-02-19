import java.util.ArrayList;
import java.util.Scanner;

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

    public double yearlySalaryIncrement(double incrementInPercentage) {
        float salary = 35000;
        double newSalary = salary * incrementInPercentage / 100;
        return newSalary;
    }

    public double individualSalaryRaise(double incrementInPercentage, int ID) {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).getFirstName() + " " + employeeList.get(i).getLastName() +
                 " " + employeeList.get(i).getSalary());
        }
        double salary = employeeList.get(1).getSalary();
        double newIndividualSalary = salary * incrementInPercentage / 100;
        return newIndividualSalary;
    }
}




