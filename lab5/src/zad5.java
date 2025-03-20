public class zad5 {
    public static void main(String[] args) {
        String input = "Если есть хвосты по дз, начните с 1 несданного задания. 123 324 111 4554";

        String[] words = input.split("\\s");

        boolean foundPalindrome = false;

        for (String word : words) {
            if (word.matches("\\d+")) {
                if (isPalindrome(word)) {
                    System.out.println(word);
                    foundPalindrome = true;
                }
            }
        }

        if (!foundPalindrome) {
            System.out.println("Палиндромы не найдены.");
        }
    }

    public static boolean isPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equals(reversed.toString());
    }
}