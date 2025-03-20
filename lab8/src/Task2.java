import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("numbers.txt")) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                while (true) {
                    try {
                        int number = Integer.parseInt(scanner.nextLine());
                        writer.write(number + "\n");
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка! Введите целое число.");
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        int sum = 0;
        int count = 0;

        try (FileReader reader = new FileReader("numbers.txt")) {
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number;
                count++;
                System.out.println(number);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }

        if (count > 0) {
            System.out.println("Среднее значение: " + (double) sum / count);
        } else {
            System.out.println("Нет данных для вычисления среднего.");
        }
    }
}
