package Class_Operator;

//     +=    _=      *=       /=

public class Compound_Operator7 {
    public static void main(String[] args) {

         int age = 25;
         age = age + 5;
         // first --> age + 5 --> 25+5 =30 then this 30 is assigned to age. So age = 30
        // age = 25 +5 = 30

        age += 25; // Using Compound Operator but execute like same
        // age = 25 +5 = 30

        System.out.println(age);

    }
}
