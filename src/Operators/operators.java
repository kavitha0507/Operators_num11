package Operators;

public class operators {

        public static void main(String[] args) {
            // Declare an integer variable x and assign the value 150 to it
            int x = 150;

            // Print the binary string version of the number
            System.out.println("Binary representation of x: " + Integer.toBinaryString(x));

            // Use the right shift operator (>>) to shift by 2 and assign the result to x
            // Predicted value of x after shift: 37
            // Predicted binary representation: 100101
            x = x >> 2;

            // Print the results in decimal and binary form
            System.out.println("Decimal value of x after right shift: " + x);
            System.out.println("Binary representation of x after right shift: " + Integer.toBinaryString(x));
        }
    }


