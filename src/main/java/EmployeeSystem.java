import java.util.ArrayList;

public class EmployeeSystem {

    private ArrayList<Employee> employeeList = new ArrayList<>();
    //private ArrayList<Employee> salaries = new ArrayList<>();

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
        float newSalary = 35000;
        return newSalary * incrementInPercentage / 100;
    }

    public double individualSalaryRaise(double incrementInPercentage, int ID) {
        for (Employee employee : employeeList) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() +
                    " " + employee.getSalary());
        }
        double newIndividualSalary = employeeList.get(ID).getSalary();
        return newIndividualSalary * incrementInPercentage / 100;

    }
}

/* Alternativ for loop....
    for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).getFirstName() + " " + employeeList.get(i).getLastName() +
                 " " + employeeList.get(i).getSalary());
        }*/


