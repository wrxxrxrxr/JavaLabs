package zad2;

public class Main {
    public static void main(String[] args) {
        try {
            Company company = new Company("KHURS-Company");

            Department itDepartment = new Department("IT", 10);
            Department marketingDepartment = new Department("Marketing", 5);
            company.addDepartment(itDepartment);
            company.addDepartment(marketingDepartment);

            FullEmployee fullEmployee = new FullEmployee("Илья Муромец", "Менеджер", 50000, -10000);
            ContractEmployee contractEmployee = new ContractEmployee("Человек паук", "Разработчик", 70000);

            try {
                Employee employeeWithNegativeSalary = new Employee("", "", -10000);
            } catch (SalaryException e) {
                System.err.println(e.getMessage());
            }

            System.out.println("Зарплата штатного сотрудника: " + fullEmployee.calculateSalary());
            System.out.println("Зарплата контрактного сотрудника: " + contractEmployee.calculateSalary());

            System.out.println("\n" + company);
            System.out.println("Отделы компании:");
            for (Department department : company.getDepartments()) {
                System.out.println(department);
            }

        } catch (SalaryException e) {
            System.err.println("Ошибка создания сотрудника: " + e.getMessage());
        }
    }
}