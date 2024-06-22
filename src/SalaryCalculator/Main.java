package SalaryCalculator;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Ali",1005,43,2002);

        System.out.println(employee);
        System.out.println("Vergi: " + employee.tax());
        System.out.println("Bonus: " + employee.bonus());
        System.out.println("Maaş Artışı: " + employee.raiseSalary());
        System.out.println("Toplam Maaş: " + employee.totalSalary());
    }
}
