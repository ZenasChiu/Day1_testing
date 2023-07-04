// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void printQuestionNum(int num){
        String Q = String.format("Question :%d",num);
        System.out.println(Q);
    }

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();
        Q3 q3 = new Q3();

        printQuestionNum(1);
        q1.answer();

        printQuestionNum(2);
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the number of rows:");
        String number = myObj.nextLine();
        int inChar = Integer.parseInt(number);
        System.out.println(inChar);
        q2.answer(inChar);

        printQuestionNum(3);
        q3.answer();
        // Converts byte into string





    }

}