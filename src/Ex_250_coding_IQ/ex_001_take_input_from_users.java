package Ex_250_coding_IQ;

import java.util.Scanner;

public class ex_001_take_input_from_users {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name =scanner.nextLine();
        //System.out.println(name);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        //System.out.println(age);
        System.out.println("hello your name is "+ name +" and age is " +age);
        scanner.close();
    }
}
