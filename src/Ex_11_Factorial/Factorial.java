package Ex_11_Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int fac = 1;

        if (a ==0) {
          //  fac = 1;
        }
        for (int i = 1; i <= a; i++) {
            fac = fac * i;
            
        }
        System.out.println(fac);
    }
}
