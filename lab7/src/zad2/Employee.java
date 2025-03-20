package zad2;

public class Employee {
    private String fullName;
    private String position;
    private double salary;

    public Employee(String fullName, String position, double salary) throws SalaryException {
        this.setSalary(salary);
        this.fullName = fullName;
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws SalaryException {
        if (salary < 0) {
            throw new SalaryException(salary);
        }
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return fullName + " (" + position + "), Оклад: " + salary;
    }
}
