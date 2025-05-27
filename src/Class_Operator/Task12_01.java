package Class_Operator;

public class Task12_01 {

    public static void main(String[] args) {
        int i = 11;
        i = i++ + ++i;
        System.out.println(i);

        //    a    |    b
        //    11        -
        //    11        12       +    13      13   = 24   a=13


    }
}
