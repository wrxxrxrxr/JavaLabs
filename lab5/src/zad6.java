public class zad6 {
    public static void main(String[] args) {
        String input = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
        String result = replace(input, "object-oriented programming", "OOP");
        System.out.println(result);
    }

    public static String replace(String input, String target, String replacement) {
        String lowerInput = input.toLowerCase();
        String lowerTarget = target.toLowerCase();

        int count = 0;
        int index = 0;

        while ((index = lowerInput.indexOf(lowerTarget, index)) != -1) {
            count++;
            if (count % 2 == 0) {
                input = input.substring(0, index) + replacement + input.substring(index + target.length());
            }
            index += target.length();
        }

        return input;
    }
}