package Class_Operator;

public class Task_11_02 {

    public static void main(String[] args) {

        int a = 50;
        int b = 100;
        int c = 5;
       // condition ? true : false;
        // (con 1) ? (Con2 ? val 1 : val 2) : (Con 3 ? val 1 : val 2);
        String s = (a >= b)
                ? (a >= c ? "a is Maximum" : "c is Maximum")
                : (b >= c ? "b is Maximum" : "c is Maximum");

        System.out.println( s );
    }
}
