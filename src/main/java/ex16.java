/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Chase Cutshall
 */

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String age;
        System.out.print(" What is your age? ");

        age = input.next();

        Integer a = Integer.parseInt(age);

        String b;

        b = (a >15) ? "You can drive" : "You cannot drive";

        System.out.print(b);




}
}
