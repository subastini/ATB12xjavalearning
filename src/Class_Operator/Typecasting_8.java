package Class_Operator;

// Type casting is converting one data type into another
// Widening --> Automatically convert smaller datatype into Larger by JVM by compiling
// Narrowing --> JVM is converting larger datatype into smaller

public class Typecasting_8 {
    public static void main(String[] args) {

        int a = 100;
       long b = a; //Widening implicit --> Automatically store int in long
        //long b = (int) a; // Widening Explicit --> v r Manually assigning int in long

        int x = 10;
       // byte y = x;
         byte y = (byte) x ;




        System.out.println(y);



    }
}
