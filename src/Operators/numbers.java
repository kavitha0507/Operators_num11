package Operators;

public class numbers {
    public static void main(String[] args) {
        // Declare an integer variable x and assign the value 2 to it
        int x = 2;

        // Print the binary string version of the number
        System.out.println("Binary representation of x: " + Integer.toBinaryString(x));

        // Use the left shift operator (<<) to shift by 1 and assign the result to x
        // Predicted value of x after shift: 4
        // Predicted binary representation: 100
        x = x << 1;

        // Print the results in decimal and binary form
        System.out.println("Decimal value of x after left shift: " + x);
        System.out.println("Binary representation of x after left shift: " + Integer.toBinaryString(x));
    }
}
