package Ex_10_For_loop;

public class Print_even {

    public static void main(String[] args) {
        // print even num from 1 to 50

        // int num = 100;
        for (int num = 1; num <= 50; num++)
            if (num % 2 == 0) {
                System.out.println("Even -->" + num);
            } else {
                System.out.println("Odd --> " + num);
            }
    }
}