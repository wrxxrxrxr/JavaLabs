import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Выберите номер задания: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int[] values = {1, 2, 3};
                int[] weights = {1, 2, 10};

                Array picker = new Array(values, weights);
                System.out.println("Случайный элемент: " + picker.getRandomValue());
                break;
            case 2:
//                Person person = new Person();
//                person.setName("Алексей");
//                person.setAge(30);
//                person.setGender("мужчина");
                Person person = new Person("Алексей", 30, "мужской");

                person.introduce();
                person.walk();
                person.birthday();
                person.sleep();
                break;
            default:








                
                System.out.println("Не корректоно введено задание");
        }
    }
}
