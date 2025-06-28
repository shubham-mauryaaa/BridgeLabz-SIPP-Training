package OOps_Basic;

public class Student {
    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("Alice", 101, 85.5);
        StudentDetails student2 = new StudentDetails("Bob", 102, 90.0);
        StudentDetails student3 = new StudentDetails("Charlie", 103, 78.0);

        System.out.println("Student 1: " + student1.name + ", Roll Number: " + student1.rollNumber + ", Marks: " + student1.marks+" Grade: " + (student1.marks >= 85 ? "A" : student1.marks >= 75 ? "B" : "C"));
        System.out.println("Student 2: " + student2.name + ", Roll Number: " + student2.rollNumber + ", Marks: " + student2.marks+" Grade: " + (student2.marks >= 85 ? "A" : student2.marks >= 75 ? "B" : "C"));
        System.out.println("Student 3: " + student3.name + ", Roll Number: " + student3.rollNumber + ", Marks: " + student3.marks+" Grade: " + (student3.marks >= 85 ? "A" : student3.marks >= 75 ? "B" : "C"));
    }
}
class StudentDetails {
    String name;
    int rollNumber;
    double marks;

    StudentDetails(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
}
