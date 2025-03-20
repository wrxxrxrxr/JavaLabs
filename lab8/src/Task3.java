import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(100);

            try {
                FileWriter writerF = new FileWriter("f.txt", true);
                writerF.write(number + "\n");
                writerF.close();

                if (number % 2 == 0) {
                    FileWriter writerG = new FileWriter("g.txt", true);
                    writerG.write(number + "\n");
                    writerG.close();
                } else {
                    FileWriter writerH = new FileWriter("h.txt", true);
                    writerH.write(number + "\n");
                    writerH.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при работе с файлами: " + e.getMessage());
            }
        }
    }
}
