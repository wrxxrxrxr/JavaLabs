package zad2;

public class Department {
    private String name;
    private int employeeCount;

    public Department(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        return "Отдел: " + name + ", Количество сотрудников: " + employeeCount;
    }
}
