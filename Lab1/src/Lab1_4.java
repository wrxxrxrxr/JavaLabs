import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание (3-5):");
        System.out.println("3. Вывод дня недели");
        System.out.println("4. Вывод названий стран");
        System.out.println("5. Вычисление факториала");
        int choice = scanner.nextInt();

        switch (choice) {
            case 3:
                System.out.print("Введите номер дня недели (1-7): ");
                int day = scanner.nextInt();
                switch (day) {
                    case 1: System.out.println("Понедельник"); break;
                    case 2: System.out.println("Вторник"); break;
                    case 3: System.out.println("Среда"); break;
                    case 4: System.out.println("Четверг"); break;
                    case 5: System.out.println("Пятница"); break;
                    case 6: System.out.println("Суббота"); break;
                    case 7: System.out.println("Воскресенье"); break;
                    default: System.out.println("Неверный номер дня недели");
                }
                break;

            case 4:
                System.out.print("Введите количество стран: ");
                int n = scanner.nextInt();
                scanner.nextLine(); // consume newline
                String[] countries = new String[n];
                for (int i = 0; i < n; i++) {
                    System.out.print("Введите название страны: ");
                    countries[i] = scanner.nextLine();
                }
                int i = 0;
                while (i < n) {
                    System.out.println("Страна " + (i + 1) + ": " + countries[i]);
                    i++;
                }
                break;

            case 5:
                System.out.print("Введите число: ");
                int num = scanner.nextInt();
                for (int j = 1; j <= num; j++) {
                    long factorial = 1;
                    for (int k = 1; k <= j; k++) {
                        factorial *= k;
                    }
                    System.out.println("Факториал " + j + " = " + factorial);
                }
                break;
            default:
                System.out.println("Неверный выбор");
        }
    }
}