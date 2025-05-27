package Ex_10_For_loop;

public class Print_only_even_num {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i %2 == 0) { // odd i%2!=0
                System.out.println(i);
                continue;

            }
            //else {
            //    System.out.println("Odd-->" + i);
            }
        }
    }

