package part5.Task35;

class CommissionEmployee extends Employee {
    private double commissionRate;

    public CommissionEmployee(String name) {
        super(name, "Commission");
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public void setSalary(double sales) {
        super.setSalary(sales * commissionRate);
    }
}
