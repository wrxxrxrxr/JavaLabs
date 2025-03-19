package z2;

public class CollegeStudent extends Student
{
    private String collegeName;
    public CollegeStudent(String collegeName, String name, int age) {
        super(name, age);
        this.collegeName = collegeName;
    }
    public void write() {
        super.write();
        System.out.println("Name: " + collegeName);
    }
}
