package part5.Task35;

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String name) {
        super(name);
        super.position = "Base Plus Commission";
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void setSalary(double sales) {
        super.setSalary(sales);
        super.salary += baseSalary;
    }
}
