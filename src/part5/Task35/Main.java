package part5.Task35;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Viktor", "Employee");
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Ivan");
        CommissionEmployee commissionEmployee = new CommissionEmployee("Petr");
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Pavel");

        employee.setSalary(1000);
        hourlyEmployee.setHourlyRate(10);
        hourlyEmployee.setSalary(80);
        commissionEmployee.setCommissionRate(0.1);
        commissionEmployee.setSalary(10000);
        basePlusCommissionEmployee.setCommissionRate(0.2);
        basePlusCommissionEmployee.setBaseSalary(5000);
        basePlusCommissionEmployee.setSalary(10000);

        System.out.println(employee.getSalary());
        System.out.println(hourlyEmployee.getSalary());
        System.out.println(commissionEmployee.getSalary());
        System.out.println(basePlusCommissionEmployee.getSalary());
    }
}
