package javaapplication36;

import java.util.Scanner;

public class JavaApplication36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a value of x1");
        double x1 = input.nextInt();
        System.out.println("please enter a value of y1");
        double y1 = input.nextInt();
        System.out.println("please enter a value of x2");
        double x2 = input.nextInt();
        System.out.println("please enter a value of y2");
        double y2 = input.nextInt();
        System.out.println("please enter a value of x3");
        double x3 = input.nextInt();
        System.out.println("please enter a value of y3");
        double y3 = input.nextInt();
        
        double a = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        double b = Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
        double c = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        
        double A = Math.acos(((b*b) + (c*c) - (a*a)) / (2*b*c));
        double B = Math.acos(((a*a) + (c*c) - (b*b)) /( 2*a*c));
        double C = Math.acos(((a*a) + (b*b) - (c*c)) / (2*a*b));
        
        System.out.println("The angle of A is " + A);
        System.out.println("The angle of B is " + B);
        System.out.println("The angle of C is " + C);


    }

}
