import java.io.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter("temperature.txt")) {
            System.out.println("Введите 15 вещественных значений температуры воздуха:");
            for (int i = 0; i < 4; i++) {
                writer.write(scanner.nextDouble() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        double sum = 0;
        int count = 0;
        try (FileReader reader = new FileReader("temperature.txt")) {
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }

        if (count > 0) {
            System.out.println("Средняя температура: " + (sum / count));
        } else {
            System.out.println("Нет данных для вычисления средней температуры.");
        }
    }
}
