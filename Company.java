package  Lab6;
import java.util.ArrayList;
import java.util.List;

public class Company implements Department {
    private List<Department> departments = new ArrayList<>();

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public int totalWage() {
        int total = 0;
        for(Department department : departments){
            total = total + department.totalWage();
        }
        return total;
    }

    @Override
    public int numberOfEmployees() {
        int num = 0;
        for (Department department : departments){
            num += department.numberOfEmployees();
        }
        return num;
    }

    @Override
    public void addEmployee(Department employee) {
        departments.add(employee);
    }


}