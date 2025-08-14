import java.util.Scanner;


public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.next();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        Student student = new Student(name, age);

        System.out.print("Name: " + student.getName() + ", Age: " + student.getAge());

        scanner.close();
    }
}

