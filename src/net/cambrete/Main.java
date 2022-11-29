package net.cambrete;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answers[] = new String[3];
        String correct_answers[] = {"Paris", "4", "O2"};
        int score = 0;

        System.out.println("Answer the question!!!");
        System.out.println("1 - ¿What is the capital of France?");
        answers[0] = input.next();
        System.out.println("2 - ¿What is the square root of 16??");
        answers[1] = input.next();
        System.out.println("3 - ¿What is the chemical composition of oxygen??");
        answers[2] = input.next();

        if (answers[0].equals(correct_answers[0])) {
            score++;
        }
        if (answers[1].equals(correct_answers[1])) {
            score++;
        }
        if (answers[2].equals(correct_answers[2])) {
            score++;
        }

        System.out.println("You score is: " + score + "to 3");

    }
}