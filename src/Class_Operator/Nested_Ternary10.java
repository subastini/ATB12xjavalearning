package Class_Operator;

public class Nested_Ternary10 {
    public static void main(String[] args) {

        int a = 100;
        int b = a > 200 ? 1 : 0;
        int b1 = a > 200 ? 1 : (a > 300 ? 10 : 20 );
        System.out.println(b);
        System.out.println(b1);
    }
}
