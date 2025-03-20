package zad2;

public class FullEmployee extends Employee{
    private double bonus;

    public FullEmployee(String fullName, String position, double salary, double bonus) throws SalaryException {
        super(fullName, position, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public double calculateSalary() {
        try {
            if (bonus < 0) {
                throw new BonusException("Премия не может быть отрицательной: " + bonus);
            }
            return getSalary() + bonus;
        } catch (BonusException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return getSalary();
        }
    }
}
