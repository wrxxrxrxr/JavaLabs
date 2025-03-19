import java.util.Random;
import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        int[] array=new int[10];

        Random random = new Random();
        for(int i=0; i<array.length;i++)
        {
            array[i]= random.nextInt(100);
        }

        System.out.println("Исходный массив:");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите A: ");
        int a = in.nextInt();
        System.out.print("Введите B: ");
        int b = in.nextInt();

        for(int i=0; i<array.length-1; i++)
        {
            if(array[i]%2==0 && i>=a && i<=b){
                array[i]= array[i-1] + array[i+1];
            }
        }
        System.out.println("Измененный массив:");
        for(int i=0; i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
