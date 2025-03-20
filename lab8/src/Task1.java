import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("info.txt")) {
            writer.write("Имя: Артём\nВозраст: 17\nГород: Минск");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileReader reader = new FileReader("info.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }
    }
}
