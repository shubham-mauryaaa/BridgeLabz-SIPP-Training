package OOps_Basic;

public class EmployeeDetails {
    int name;
    int id;
    int salary;
    EmployeeDetails(int name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails(101, 1, 50000);
        EmployeeDetails emp2 = new EmployeeDetails(102, 2, 60000);
        
        System.out.println("Employee 1: Name=" + emp1.name + ", ID=" + emp1.id + ", Salary=" + emp1.salary);
        System.out.println("Employee 2: Name=" + emp2.name + ", ID=" + emp2.id + ", Salary=" + emp2.salary);
    }
}


