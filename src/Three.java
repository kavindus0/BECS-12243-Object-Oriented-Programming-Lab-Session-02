import java.util.Scanner;
import java.util.*;
public class Three{
    public static void main(String[] atgs){
        int int1;int int2;
        int1 = Integer.valueOf(atgs[0]);
        int2 = Integer.valueOf(atgs[1]);
        System.out.println("You Entered: "+(int1) + " and "+(int2));
        System.out.println("Sum: "+(int1+int2));
        System.out.println("Difference: "+(int1-int2));
        System.out.println("Product: "+(int1*int2));
        System.out.println("Quotient: "+(int1/int2));
        System.out.println("Remainder: "+(int1%int2));
    }
}