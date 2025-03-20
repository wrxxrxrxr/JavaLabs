package zad3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-15s %s%n", "Фамилия", "Зарплата");

        for (Employee employee : employees) {
            System.out.printf("%-15s %8.2f%n", employee.getFullname(), employee.getSalary());
        }
    }
}
