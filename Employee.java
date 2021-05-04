package  Lab6;
public class Employee implements Department {


    private int wage;
    public Employee(int w) {
        wage = w;
    }

    @Override
    public int totalWage() {
        return wage;
    }

    @Override
    public int numberOfEmployees() {
        return 1;
    }

    @Override
    public void addEmployee(Department employee) {

    }

}