package sdf_assessment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1;
        int num2;
        int result;
        char operator;
        int $last = 0;
        System.out.printf("Welcome.\n");

        try (Scanner input = new Scanner(System.in)) {
            boolean exit = false;
            String quitProgram ="";
            while (quitProgram != "exit") {

                System.out.printf("> ");

                num1 = input.nextInt();
                operator = input.next().charAt(0);
                num2 = input.nextInt();
                quitProgram = input.nextLine();

                if (operator == '+') {
                    result = num1 + num2;
                    System.out.println(result);
                } else if (operator == '-') {
                    result = num1 - num2;
                    System.out.println(result);
                } else if (operator == '/') {
                    result = num1 / num2;
                    System.out.println(result);
                } else if (operator == '*') {
                    result = num1 * num2;
                    System.out.println(result);
                }
                // switch (operator) {
                //     case '+':
                //         result = num1 + num2;
                //         System.out.println(result);
                //         $last = result;
                //         break;
                //     case '-':
                //         result = num1 - num2;
                //         System.out.println(result);
                //         $last = result;

                //         break;
                //     case '/':
                //         result = num1 / num2;
                //         System.out.println(result);
                //         break;
                //     case '*':
                //         result = num1 * num2;
                //         System.out.println(result);
                //         break;
                //     default:
                //         System.out.println("Only integers and operators are allowed");
                //         break;
                // }

                }
        }

        System.out.println("Bye bye");
    }
}
