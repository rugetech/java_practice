package practice3;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        int fst = 0, sec = 0, choice = 0, add, sub, mul;
        float div;
        String _fst, _sec, choose, welcome;

        System.out.println(" ");
        welcome = "Welcome to a Simple Calculator";
        System.out.println("...................................................\n");
        _sec = "Your second number>> ";
        _fst = "Your first number>> ";
        choose = "Choose Mathematical Operation:";
        System.out.println("...................................................\n"
                + welcome
                + "\n...................................................\n\n");

        Scanner take = new Scanner(System.in);
        boolean validInput = false;

        // Input for the first number with validation
        while (!validInput) {
            try {
                System.out.print(_fst);
                fst = take.nextInt();
                validInput = true;  // Valid input, exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                take.next(); // Clear the invalid input
            }
        }

        validInput = false;  // Reset for the second number

        // Input for the second number with validation
        while (!validInput) {
            try {
                System.out.print(_sec);
                sec = take.nextInt();
                validInput = true;  // Valid input, exit loop
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                take.next(); // Clear the invalid input
            }
        }

        add = fst + sec;
        sub = fst - sec;
        mul = fst * sec;
        if (sec != 0) {
            div = (float) fst / sec;
        } else {
            div = 0;
            System.out.println("Error: Cannot divide by zero.");
        }

        System.out.println("......................");
        System.out.println(_fst + fst);
        System.out.println(_sec + sec);

        boolean validChoice = false;

        // Loop for valid choice input
        while (!validChoice) {
            System.out.println("......................");
            System.out.println(choose);
            System.out.println("1 : Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("......................");
            System.out.print("Choice>> ");
            choice = take.nextInt();
            System.out.println("......................");

            if (choice >= 1 && choice <= 4) {
                validChoice = true;  // Valid choice, exit loop
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        // Switch case to perform the selected operation
        switch (choice) {
            case 1:
                System.out.println(">>>> " + fst + " plus " + sec + " = ");
                System.out.println(">>>> processing...");
                System.out.println("The Answer>> " + add);
                break;
            case 2:
                System.out.println(">>>> " + fst + " minus " + sec + " = ");
                System.out.println(">>>> processing...");
                System.out.println("The Answer>> " + sub);
                break;
            case 3:
                System.out.println(">> " + fst + " multiplied by " + sec + " = ");
                System.out.println(">>>> processing...");
                System.out.println("The Answer>> " + mul);
                break;
            case 4:
                if (sec != 0) {
                    System.out.println(">> " + fst + " divided by " + sec + " = ");
                    System.out.println(">>>> processing...");
                    System.out.println("The Answer>> " + div);
                } else {
                    System.out.println(">>>> Division by zero is undefined.");
                }
                break;
        }

        take.close();
        System.out.println("Calculator program has ended.");
    }
}
