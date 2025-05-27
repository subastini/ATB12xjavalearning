package Class_Operator;

public class Increament_Operator12 {

    public static void main(String[] args) {

        int a = 10;
        int b = ++a;
        System.out.println(b);
        System.out.println(a);

        // a    |     b
        // 10         0   stores actual value of a
        // 11         11  ++a --> 1st increase a by 1 a = 11 then assign new value a to b b= 11

        int a1 = 10;
       int b1 = a1++;
       System.out.println(a1);
       System.out.println(b1);

        // a    |     b
        // 10         0    stores actual value of a
        // 11        10  a++--> Current value of a assigned to b b= 10 then a increase by 1

       // int a2 = 10;
      //  System.out.println(a2++ + ++a2);
      //  System.out.println(a2);

        //     a     |      b
        //     10           -
        //     11           10
        //     11           11  (11+11)=22

    }
}
