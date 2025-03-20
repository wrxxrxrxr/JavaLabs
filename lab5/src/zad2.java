public class zad2 {
    public static void main(String[] args) {
        System.out.println(Middle("string"));
        System.out.println(Middle("cod"));
        System.out.println(Middle("Practice"));
    }

    public static String Middle(String str) {
        int length = str.length();

        if (length % 2 != 0) {
            System.out.println("Длина строки должна быть четным числом.");
        }

        int midIndex = length / 2;
        return str.substring(midIndex - 1, midIndex + 1);
    }
}