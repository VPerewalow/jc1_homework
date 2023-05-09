package part5.Task35;

class Employee {
    private String name;
    String position;
    double salary;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
