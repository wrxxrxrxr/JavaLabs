package zad2;

public class SalaryException extends Exception {
    public SalaryException(double salary) {
        super("Невозможно создать сотрудника – указан отрицательный оклад: " + salary);
    }
}

