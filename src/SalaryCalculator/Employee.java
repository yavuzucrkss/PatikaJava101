package SalaryCalculator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public double tax(){
        if(this.salary > 1000)
            return this.salary * 0.03;
        else
            return 0;
    }

    public double bonus(){
        if(workHours > 40){
            return 4 * (this.workHours - 40);
        }
        return 0;
    }

    public double raiseSalary(){
        int totalYear = 2021 - this.hireYear;

        if(totalYear > 19)
            return this.salary * 0.15;
        else if(totalYear > 9)
            return this.salary * 0.10;
        else {
            return this.salary * 0.05;
        }
    }

    public double totalSalary(){
        return salary + bonus() + raiseSalary() - tax();
    }
}
