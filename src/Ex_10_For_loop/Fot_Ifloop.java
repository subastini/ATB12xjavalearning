package Ex_10_For_loop;

import Ex_08_Scanner_Class.Scanner_;

import java.util.Scanner;

public class Fot_Ifloop {
    public static void main(String[] args) {

       // Scanner s = new Scanner(System.in);
       // System.out.println("Enter mark");
        for (int score = 96; score < 100; score++) {

            if (score < 97) {
                System.out.println("School first");
            }
            else {

                System.out.println("Fail");
            }

            }
        }
    }