package part5.Task35;

class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(String name) {
        super(name, "Hourly");
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void setSalary(double hours) {
        super.setSalary(hours * hourlyRate);
    }
}
