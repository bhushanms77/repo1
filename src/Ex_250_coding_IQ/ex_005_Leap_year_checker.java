//Create a program that determines whether a given year is a leap year.
// A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
// Use an if-else statement to make this determination.
package Ex_250_coding_IQ;

import java.util.Scanner;

public class ex_005_Leap_year_checker {
    static public void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Year");
        int year = scanner.nextInt();
        if ((year%4 == 0 && year%100 != 0 ) || ( year%400 == 0)){
            System.out.println("this is Leap year"+ year);

        }
        else {
            System.out.println("Not a Leap year" +year);
        }


    }
}

