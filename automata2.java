import java.util.Scanner;

public class automata2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int x = scan.nextInt();
        System.out.print("Enter the second integer: ");
        int y = scan.nextInt();

        int a = Math.max(x, y);
        int b = Math.min(x, y);

        System.out.println("\nSOLUTION:");

        int dividend = a;
        int divisor = b;
        int gcd = 0;

        while (divisor != 0) {
            int q = dividend / divisor;
            int r = dividend % divisor;

            if (r == 0) {
                System.out.println(dividend + " = " + divisor + " (" + q + ")");
                gcd = divisor;
            } else {
                System.out.println(dividend + " = " + divisor + " (" + q + ") + " + r);
            }

            dividend = divisor;
            divisor = r;
        }

        int lcm = (a * b) / gcd;

        System.out.println("\nThe integers are " + a + " and " + b);
        System.out.println("The greatest common divisor of " + a + " and " + b + " is " + gcd);
        System.out.println("The least common multiple of " + a + " and " + b + " is " + lcm + ".");

        scan.close();
    }
}