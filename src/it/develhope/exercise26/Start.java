package it.develhope.exercise26;

public class Start {
    public static void main(String[] args) {
        //Variables declaration for the boolean expression 'b'

        int x = 3;
        int y = 2;

        boolean a = !(!(!(false ^ false) || (true && true))); /* the first condition and second condition are true,
                                                                (we need just 1) the result is true */
        boolean b = !((x * y) <= 6) && (x - y != 1); // all the conditions are false so the result is false

        System.out.println("A : true " + a);
        System.out.println("B : false " + b);
    }
}
