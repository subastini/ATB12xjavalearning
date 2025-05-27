package Ex_09_Switch_Statement;

import java.util.Scanner;

public class Switch_If {
    public static void main(String[] args) {

        System.out.println("Enter value");

        Scanner s = new Scanner(System.in);
        int a = 1;

        if (s.hasNextInt()){
            a=s.nextInt();
            System.out.println(s);
        }
    }
}
