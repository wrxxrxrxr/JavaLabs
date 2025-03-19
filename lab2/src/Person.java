public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender ){
        this.name = name;
        this.age= age;
        this.gender= gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    void introduce() {
        System.out.println("Привет, меня зовут " + name + ". Мне " + age + " лет.");
    }

    void walk() {
        System.out.println(name + " идет.");
    }

    void birthday() {
        age++;
        System.out.println("Сегодня день рождения " + name + "! Теперь мне " + age + " лет.");
    }

    void sleep() {
        System.out.println(gender + " спит.");
    }
}
