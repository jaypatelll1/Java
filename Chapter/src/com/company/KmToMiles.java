package com.company;
import java.util.*;
public class KmToMiles {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the kilometer To Convert Into Miles");
        double a= in.nextInt();
        double c= a* 0.62137;
        System.out.println("Miles: "+c);

    }
}
