package zad2;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван", 1000054321),
                new Employee("Петров Петр", 60000),
                new Employee("Сидоров Сидор", 55000.0123456780),
                new Employee("Кузнецов Николай", 70000.00)
        };

        System.out.println("Отчет на английском (USD):");
        FullReport.generateReport(employees, Locale.ENGLISH);
        System.out.println("--------------------------------------");
        System.out.println("\nОтчет на русском:");
        FullReport.generateReport(employees, new Locale("ru"));
    }
}