package Ex_07_Conditional_Statement;

public class If_String2integer {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]) ; // getting i/p from user
// args[0] = "25" (a string)
//Integer.parseInt("25") = 25 (an integer)
//So, a = 25
        if ( a>=18) {
            System.out.println("Can Vote");

        }

        else {
            System.out.println("Can't Vote");
        }







    }
}
