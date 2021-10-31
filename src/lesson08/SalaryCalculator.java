package lesson08;

import javax.swing.text.SimpleAttributeSet;
import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

//        Manager manager = new Manager();
//        StandardEmp standardEmp = new StandardEmp();
//        employee.add(ceo);
//        employee.add(manager);
//        employee.add(standardEmp);
//        System.out.println(getTotalSalaries(employee));
          Employee ceo = new CEO();
          Employee manager = new Manager();
          Employee standardEmp = new StandardEmp();
          standardEmp = new Manager();
          employee.add(ceo);
        employee.add(manager);
        employee.add(standardEmp);
        System.out.println(getTotalSalaries(employee));
    }
    static double getTotalSalaries(List<Employee> employees){
        double totalSalaries = 0.0;
        for (Employee employee : employees) {
            totalSalaries = totalSalaries + employee.getSalary()+ employee.getSupportMoney();

        }
        return totalSalaries;
    }
}
