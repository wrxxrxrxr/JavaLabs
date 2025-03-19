import java.util.Random;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Выберите задание (1-5):");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            double x = Math.pow(4, 2) - 2 * 4;
            System.out.println("Значение выражения: " + x);
            break;

            case 2:
                int[] array=new int[10];

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
                break;

            case 3:
                int[][] matrix = new int[3][3];

                for(int i=0; i< matrix.length; i++)
                {
                    for(int j=0; j< matrix[i].length; j++)
                    {
                        matrix[i][j] = random.nextInt(25);
                    }
                }
                System.out.println("Матрица: ");
                for(int i=0; i< matrix.length; i++)
                {
                    for(int j=0; j< matrix[i].length; j++)
                    {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();

                System.out.println("Главная диагональ: ");
                for(int i=0; i < matrix.length; i++)
                {
                    System.out.println(matrix [i][i] + " ");
                }
                System.out.println();

                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][i]= matrix[i][i] * matrix[i][i];
                }
                System.out.println("Главная диагональ в квадрате: ");
                for(int i=0; i< matrix.length; i++)
                {
                    System.out.print(matrix[i][i] + " ");
                }

                break;

            case 4:
                System.out.println("Выберите задание (3-5):");
                System.out.println("3. Вывод дня недели");
                System.out.println("4. Вывод названий стран");
                System.out.println("5. Вычисление факториала");
                int choise = scanner.nextInt();

                switch (choise) {
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
                        System.out.print("Введите столицу(1-Минск, 2-Москва, 3-Париж): ");
                        String n = scanner.next();
                        switch (n){
                            case "Minsk": System.out.println("Беларусь"); break;
                            case "Moscow": System.out.println("Россия"); break;
                            case "Paris": System.out.println("Франция"); break;
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
                break;

                case 5:
                    for (int i = 30; i <= 86; i++) {
                        if (i <= 33 || i >= 77) {
                            System.out.print(i + "\t");
                        }
                    }
                    break;
        }
    }
}