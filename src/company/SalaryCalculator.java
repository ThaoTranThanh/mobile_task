package company;

import java.util.Arrays;
import java.util.List;

public class SalaryCalculator {


public static double getTotalSalary(List<Employee> employees){
        double totalSalary = 0.0;
    for (Employee employee : employees) {
        totalSalary = totalSalary + employee.getSalary();
    }
        return totalSalary;
}

    public static void main(String[] args) {
        CEO ceo = new CEO();
        Manager manager = new Manager();
        StandardEmployee standardEmployee = new StandardEmployee();
        // SalaryCalculator salaryCalculator = new SalaryCalculator();
        double totalSalaries = SalaryCalculator.getTotalSalary(Arrays.asList(ceo,manager,standardEmployee));
        System.out.printf("Total Monthly Salary: %f", totalSalaries);
    }
}
