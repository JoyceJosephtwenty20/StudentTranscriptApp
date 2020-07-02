import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student1 = new Student();

        String anotherStudent ="";
        String anotherCourse = "";

    do {
        System.out.println("Enter Student ID number:");
        int studentID = input.nextInt();
        input.nextLine();  // Buffer
        System.out.println(("Enter Student's first name:"));
        String studentFristName = input.nextLine();
        System.out.println("Enter Student's last name: ");
        String studentLastName = input.nextLine();
        System.out.println("Enter course:");
        String studentCourse = input.nextLine();
        System.out.println("Enter credits:");
        int studentCredits = input.nextInt();
        System.out.println("Enter grade:");
        String stuentGrade = input.next();

        student1.setIdNumber(studentID);
        student1.setFirstName(studentFristName);
        student1.setLastName(studentLastName);
        student1.setCourse(studentCourse);
        student1.setCredits(studentCredits);
        student1.setGrade(stuentGrade);

        if (stuentGrade.equalsIgnoreCase("A")) {
            student1.setQualityPoint(4.0);
        } else if (stuentGrade.equalsIgnoreCase("B")) {
            student1.setQualityPoint(3.0);
        } else if (stuentGrade.equalsIgnoreCase("C")) {
            student1.setQualityPoint(2.0);
        } else {
            student1.setQualityPoint(1.0);
        }

        System.out.println("Another course? (y/n)");
        anotherCourse = input.nextLine();

        input.nextLine();
        System.out.println("Anther Student? (y/n)");
        anotherStudent = input.next();

    } while(!anotherCourse.equalsIgnoreCase("n") && !anotherStudent.equalsIgnoreCase("n"));

        System.out.println(student1.getFirstName() + " "+ student1.getLastName() + "\nStudent ID:" + student1.getIdNumber());
        System.out.println("Course\t\tCredits \tGrade\tQuality Points");
        System.out.println("------\t\t -------\t------\t--------");
        System.out.println(student1.printDetails());

    }

}
