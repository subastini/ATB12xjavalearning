package Ex_08_Scanner_Class;

import java.util.Scanner;

public class Scanner_ {
    public static void main(String[] args) {

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();// Getting ip from user

        if (a==10){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
