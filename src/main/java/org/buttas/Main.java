package org.buttas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Programme to Calculate Percentage.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Student");
        String sname = sc.next();
        System.out.print("Enter Marks of Subject 1: ");
        float marks1 = sc.nextFloat();
        System.out.print("Enter Marks of Subject 2: ");
        float marks2 = sc.nextFloat();
        System.out.print("Enter Marks of Subject 3: ");
        float marks3 = sc.nextFloat();
        System.out.print("Enter Marks of Subject 4: ");
        float marks4 = sc.nextFloat();
        System.out.print("Enter Marks of Subject 5: ");
        float marks5 = sc.nextFloat();

        float per = (marks1 + marks2 + marks3 + marks4 + marks5)/5;
        System.out.println("Percentage of Student " + sname + " is :" + per + "%" );
    }
}