import java.util.ArrayList;

public class EmployeeSystem {

    private ArrayList<Employee> employeeList = new ArrayList<>();
    //private ArrayList<Employee> salaries = new ArrayList<>();

    public void addNewEmployee(Employee newEmployee) {
        this.employeeList.add(newEmployee);
    }

    public ArrayList<Employee> getNewEmployee() {
        return employeeList;
    }

    public void removeEmployee(Employee newEmployee) {
        this.employeeList.remove(newEmployee);
    }

    public void yearlySalaryIncrement(float incrementInPercentage) {
        float newSalary;
        if (incrementInPercentage > 0 && incrementInPercentage <= 100) {
            for (int i = 0; i < employeeList.size(); i++) {
                newSalary = employeeList.get(i).getSalary() +
                        employeeList.get(i).getSalary() * (incrementInPercentage / 100);
                employeeList.get(i).setSalary(newSalary);
            }
        }
    }

    public void individualSalaryRaise(float incrementInPercentage, int ID) {
        float newIndividualSalary;
        for (Employee employee : employeeList) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() +
                    " " + employee.getSalary());
        }
        if (incrementInPercentage > 0 && incrementInPercentage <= 100) {
            for (int i = 0; i < employeeList.size(); i++) {
                Employee newEmployee = employeeList.get(i);
                if (ID == newEmployee.getID()) {
                    newIndividualSalary = employeeList.get(i).getSalary() +
                            employeeList.get(i).getSalary() * (incrementInPercentage / 100);
                    employeeList.get(i).setSalary(newIndividualSalary);
                }
            }
        }
    }
}
/* Alternativ for loop....
    for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).getFirstName() + " " + employeeList.get(i).getLastName() +
                 " " + employeeList.get(i).getSalary());
        }*/


