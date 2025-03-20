import java.io.*;

public class Task5 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("numbers5.txt")) {
            for (int i = 0; i < 10; i++) {
                writer.write((i - 5) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        int positiveCount = 0;
        try (FileReader reader = new FileReader("numbers.txt")) {
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > 0) {
                    positiveCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }

        System.out.println("Количество положительных чисел: " + positiveCount);
    }
}




