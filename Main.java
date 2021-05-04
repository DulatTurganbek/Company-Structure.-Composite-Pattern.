package  Lab6;
public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        //(CEO) and (CTO) Employees
        Employee employee = new Employee(5000);
        Employee employee1 = new Employee(5000);
        company.addEmployee(employee);
        company.addEmployee(employee1);


        //Employees from Department1
        Company department1 = new Company();
        Employee employee2 = new Employee(4000);
        Employee employee3 = new Employee(4000);
        department1.addEmployee(employee2);
        department1.addEmployee(employee3);
        company.addEmployee(department1);



        //Employees from Department2
        Employee employee4 = new Employee(3000);
        Company department2 = new Company();
        department2.addEmployee(employee4);
        company.addEmployee(department2);




        //Employees from Department3
        Company department3 = new Company();
        Employee employee5 = new Employee(2000);
        Employee employee6 = new Employee(2000);
        department3.addEmployee(employee5);
        department3.addEmployee(employee6);
        company.addEmployee(department3);



        Output output  = new Output();
        output.Output(company);


        System.out.println();
        System.out.println("Employees wages in dollars!");


    }
}
