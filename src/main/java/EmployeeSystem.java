import java.util.ArrayList;

public class EmployeeSystem {

    private ArrayList<Employee> addNewEmployee = new ArrayList<>();

    public void addNewEmployee(Employee newEmployee){
        this.addNewEmployee.add(newEmployee);
    }

    public ArrayList<Employee> getNewEmployee() {
        return addNewEmployee;
    }

}
