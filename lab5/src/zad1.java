public class zad1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("2 = 2");

        int start = sb.indexOf("=");
        if (start != -1) {
            sb.replace(start, start + 1, "равно");
        }

        System.out.println(sb.toString());
    }
}