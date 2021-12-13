package AlgorithmenUbung3.CommandLine;

import AlgorithmenUbung3.StackPackage.Stack;
import AlgorithmenUbung3.data.Student;

import java.util.EmptyStackException;
import java.util.Locale;
import java.util.Scanner;

import static AlgorithmenUbung3.CommandLine.Tools.*;

public class CommandMain {
    private final Stack<Student> stack;
    private final Scanner scanner;

    public CommandMain() {

        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        stack = new Stack<>();

    }


     //Shows main menu

    public void show_main_menu() {

        String input = "";

        while (true) {

            getHeader("Main menu");

            System.out.println("(1) see stack");
            System.out.println("(2) push student");
            System.out.println("(3) pop student");
            System.out.println();
            System.out.println("(4) Empty stack");
            System.out.println();
            System.out.println("(5) get a peek at the stack");
            System.out.println();
            System.out.println("(b) End Programm");
            System.out.println();
            System.out.print("Your choice : ");

            try {
                input = scanner.next();
            } catch (Exception e) {
                System.out.println("Choice incorrect, make sure you wrote one of the options between parenthesis !");
            }

            System.out.println();

            switch (input) {
                case "0":

                    break;

                case "1":
                    show_sub_menu_show_stack();
                    break;
                case "2":
                    show_sub_menu_push_stack();
                    break;
                case "3":
                    show_sub_menu_pop_stack();
                    break;
                case "4":
                    stack.clear();
                    System.out.println("All elements in the stack were cleared !\n");
                    break;
                case "5":
                    System.out.println("head element of the stack : ");
                    stack.peek();
                    break;
                case "b":
                    System.out.println("Programm ended");
                    return;
                default:
                    showMsg("Choice incorrect !");
            }

        }

    }

    //Showing the stack :

    private void show_sub_menu_show_stack() {

        getHeader("Main menu -> Stack peek");

        if (stack.isEmpty()) {

            System.out.println("The stack is empty !");
            System.out.println();

            return;
        }

        //Function to show how many elements there are in the stack

        System.out.println("number of elemente in the Stack: " + stack.size());

        System.out.println("Stack elements:");
        stack.print();

        System.out.println();
    }


     // Shows the menu that guides in pushing a student to the stack


    private void show_sub_menu_push_stack() {
        String input = "";
        while (true) {

            getHeader("Main menu -> Add a student ");

            System.out.println("Please enter the student object that you'd like to push in the stack");
            System.out.println();
            System.out.println("(z) to go back.");
            System.out.println();
            System.out.print("Student : ");

            try {
                input = scanner.next();
            } catch (Exception e) {
                showMsg("invalid input ! ");
            }

            System.out.println();

            if (input.equals("z")) {
                show_main_menu();
            } else {

                Student s1 = addStudent();
                System.out.println();

                stack.push(s1);

                System.out.println("student added to the stack successfully !");

            }

            System.out.println();
            return;

        }
    }


     // (pop) function to delete the latest student in the stack


    private void show_sub_menu_pop_stack() {
        try {
            Student i = stack.pop();

            System.out.println("pop student: " + i);

            System.out.println();

        } catch (EmptyStackException e) {
            System.out.println("The stack is empty ! ");
            System.out.println();
        }
    }

}
