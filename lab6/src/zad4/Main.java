package zad4;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Workers> workersList = new ArrayList<>();

        workersList.add(new WorkerFix(15000.0, "Артём"));
        workersList.add(new WorkerFix(20000.0, "Миша"));
        workersList.add(new WorkerHours(105.0, "Паша"));
        workersList.add(new WorkerHours(120.0, "Настя"));
        workersList.add(new WorkerFix(18000.0, "Ваня"));
        workersList.add(new WorkerHours(100.0, "Милана"));

        for (int i = 0; i < workersList.size(); i++) {
            for (int j = i + 1; j < workersList.size(); j++) {
                Workers w1 = workersList.get(i);
                Workers w2 = workersList.get(j);

                int salaryComparison = Double.compare(w2.calculate(), w1.calculate());

                if (salaryComparison == 0) {
                    salaryComparison = w1.getName().compareTo(w2.getName());
                }

                if (salaryComparison >
                        0) {

                    workersList.set(i, w2);
                    workersList.set(j, w1);
                }
            }
        }

        System.out.println("Информация о работниках:");
        for (Workers worker : workersList) {
            System.out.println("ID: " + worker.hashCode() + ", Имя: " + worker.getName() + ", Среднемесячная зарплата: " + worker.calculate());
        }

        System.out.println("\nПервые 5 имен работников:");
        for (int i = 0; i < Math.min(5, workersList.size()); i++) {
            System.out.println(workersList.get(i).getName());
        }

        System.out.println("\nПоследние 3 идентификатора работников:");
        for (int i = Math.max(0, workersList.size() - 3); i < workersList.size(); i++) {
            System.out.println(workersList.get(i).hashCode());
        }
    }
}