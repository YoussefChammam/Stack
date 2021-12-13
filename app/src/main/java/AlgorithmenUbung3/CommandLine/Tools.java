package AlgorithmenUbung3.CommandLine;
import AlgorithmenUbung3.data.Student;

import java.math.*;
import java.util.Scanner;

public class Tools {

    public static void showMsg(String msg) {
        System.out.println();
        System.out.println(msg);
        System.out.println();
    }

    public static void getHeader(String title) {
        System.out.println(title);
        System.out.println((getUnderline(title)));
        System.out.println();
    }

    public static String getUnderline(String text) {

        String underline = "";
        for (int i = 0; i < text.length(); i++) {
            underline += "-";
        }
        return underline;
    }
    public static Student addStudent() {
        Scanner s1 = new Scanner(System.in);
        Student student = new Student("" , "" , 0 , 0);
        System.out.println("Enter the surname : ");
        student.setSurname(s1.next());
        System.out.println("Enter the name : ");
        student.setPrename(s1.next());
        System.out.println("Enter the immatrikulationsnummer : ");
        student.setMatriculationNumber(s1.nextInt());
        System.out.println("Enter the course : ");
        student.setCourse(s1.nextInt());
        return student;
    }
}
