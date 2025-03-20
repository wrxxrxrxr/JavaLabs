package zad2;
import java.util.Arrays;

public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades; // Массив оценок

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        if (grades.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    @Override
    public String toString() {
        return "Имя - " + name + ", Группа - " + group + ", Курс - " + course + ", Оценки - " + Arrays.toString(grades);
    }
}
