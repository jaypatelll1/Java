package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner subject = new Scanner(System.in);
        System.out.println("Enter first subject mark's");
        double a = subject.nextInt();
        System.out.println("Enter first subject mark's");
        double b = subject.nextInt();
        System.out.println("Enter first subject mark's");
        double c = subject.nextInt();

       double cgpa = (a+b+c)/30;
        System.out.println("The CGPA of Three subject is "+cgpa);

    }
}
