package Ex_250_coding_IQ;

import java.util.Scanner;

public class ex_004_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks");
        int score = scanner.nextInt();

        char grade;
        if(score >= 90 && score <= 100){
            grade = 'A';
        }
        else if (score < 90 && score >= 80){
            grade = 'B';
        }
        else if (score < 80 && score >= 70){
            grade = 'C';
        }
        else {
            grade = 'D';

        }

        System.out.println("grade is " + grade);


    }
}
