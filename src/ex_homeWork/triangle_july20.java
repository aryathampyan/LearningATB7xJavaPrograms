package ex_homeWork;

import java.util.Scanner;

public class triangle_july20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side1 of triange: ");
        int a=sc.nextInt();
        System.out.println("Enter side2 of triange: ");
        int b=sc.nextInt();
        System.out.println("Enter side3 of triange: ");
        int c=sc.nextInt();

        if(a==b && b==c){
            System.out.println("it is equilateral triangle");
        }else if(a==b || a==c || b==c){
            System.out.println("it is a Isosceles Triangle");
        }else {
            System.out.println("it is a Scalene Triangle");
        }
    }
}
