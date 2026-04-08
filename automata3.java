import java.util.Scanner;

public class automata3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program will find all the terms of the Collatz sequence.");
        System.out.print("Input the initial value: ");
        int x = scan.nextInt();

        if (x <= 0 || x % 2 == 0) {
            System.out.println("Invalid Input");
        } else {
            StringBuilder sequence = new StringBuilder();
            int newx = x;

            while (newx != 1) {
                sequence.append(newx).append(", ");
                if (newx % 2 != 0) {
                    newx = 3 * newx + 1;  
                } else {
                    newx = newx / 2;       
                }
            }
            sequence.append(1); 

            System.out.println("The Collatz sequence are: " + sequence.toString());
        }

        scan.close();
    }
}