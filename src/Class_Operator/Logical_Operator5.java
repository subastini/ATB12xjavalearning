package Class_Operator;

/*  Results in Boolean
   && (AND Gate) --> both should be true ( 1  , 1  ) means TRUE , (1,0)--> FALSE
   || (OR Gate)--> any one should be ture ( 0  , 1 ) Meand TRUE , (0,0)--> FAlse
   ! (NOT Gate) --> REVERSE  */

public class Logical_Operator5 {

    public static void main(String[] args) {

        //AND Gate (&&)
        boolean b0 = true;
        boolean b1 = false;
        boolean c = (b0 && b1);
        System.out.println(c);

        // OR Gate (||)
        boolean b2 = true;
        boolean b3 = true;
        boolean c1 = b2 || b3;
        System.out.println(c1);

        // NOT (Reverse)
        boolean b = true;
        System.out.println(!b);

        // System.out.println(!!B); (Double reverse)
    }
}
