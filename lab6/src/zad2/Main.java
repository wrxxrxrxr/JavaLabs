package zad2;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Дима", "Т-293", 1, new int[]{9, 7, 3}));
        students.add(new Student("Диана", "П-292", 1, new int[]{2, 1, 2}));
        students.add(new Student("Чарли", "Д-182", 3, new int[]{10, 8, 8}));

        System.out.println("Все студенты:");
        printStudents(students);

        processStudents(students);

        System.out.println("\nСтуденты после отбора:");
        printStudents(students);

        System.out.println("\nСтуденты на втором курсе 2:");
        printStudentsByCourse(students, 2);
    }

    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void printStudentsByCourse(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}