import java.util.Random;

public class Lab1_3 {
    public static void main(String[] args) {
        int[][] array= new int[3][3];
        Random random = new Random();

        for(int i=0; i< array.length; i++)
        {
            for(int j=0; j< array[i].length; j++)
            {
                array[i][j] = random.nextInt(25);
            }
        }
        System.out.println("Матрица: ");
        for(int i=0; i< array.length; i++)
        {
            for(int j=0; j< array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Главная диагональ: ");
        for(int i=0; i < array.length; i++)
        {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        System.out.println("Главная диагональ в квадрате: ");
        for(int i=0; i< array.length; i++)
        {
            System.out.print(array[i][i] * array[i][i] + " ");
        }
    }
}
