package Class_Operator;
/* Concat means join or merge. Some operator behaves differently with data type.
 Concast is also known as Method Over loading. YES, operator-overloaded is supported in JAVA
*        + Operator in String (Suba+Stini) --> Subastini
*        + Operator in Integer (a+b) --> 30    */

public class Concatenation_Operator6 {
    public static void main(String[] args) {

        String s = "Help";
        String s1 = "me";
        System.out.println(s+s1);

        int a = 50;
        int b = 60;
        System.out.println(a+b);

        System.out.println(s+s1+a+b); // Helpme5060
        System.out.println(a+b+s+s1); // 110Helpme
        System.out.println(s+s1+(a+b)); // Helpme110

    }
}
