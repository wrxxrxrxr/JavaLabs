package zad3;
public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Bird("Воробей", 25, "острый");
        System.out.println(sparrow.fly());
        System.out.println(sparrow.land());
        System.out.println(sparrow.feed());
        System.out.println(sparrow.attack());
        System.out.println(sparrow.getWings().flap());
        System.out.println(sparrow.getBeak().peck());
    }
}
