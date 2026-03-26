import java.util.Scanner;

public class automata1 {
    public static void main(String[] args) {
        Scanner anotara = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int dubaichewychocolate = anotara.nextInt();
        System.out.print("Enter the second integer: ");
        int ilocosempanada = anotara.nextInt();
        
        int dividend = Math.max(dubaichewychocolate, ilocosempanada);
        int divisor = Math.min(dubaichewychocolate, ilocosempanada);
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("\nSOLUTION:");
        System.out.println(dividend + " = " + divisor + " (" + quotient + ") + " + remainder);
        System.out.println("The dividend is " + dividend);
        System.out.println("The divisor is " + divisor);
        System.out.println("The quotient is " + quotient + " and the remainder is " + remainder);

        anotara.close();
    }
}