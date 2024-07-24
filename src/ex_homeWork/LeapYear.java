package ex_homeWork;
import java.util.Scanner;

public class LeapYear {

        public static void main(String[] args) {

            //int year;
            Scanner sc = new Scanner(System.in); // create a scanner object
            System.out.println("Enter a year");
            int year = sc.nextInt(); // Read a user input

       /* System.out.println("Enter a division number");
        int div = sc.nextInt();*/

            if(year%4==0 || year%400==0){
                System.out.println(year + "--> is a leap year");
            }else{
                System.out.println(year + "--> is not a leap year");
            }
            sc.close();
        }
    }

