package Operators;

public class Preceding {

        public static void main(String[] args) {
            // Declare three int variables: x, y, and z
            int x = 7;
            int y = 17;
            int z;

            // Predicted result of bitwise OR operation on x and y:
            // 7 in binary:  0111
            // 17 in binary: 10001
            // Predicted result: 10111 (decimal 23)

            // Use the bitwise OR (|) operator
            z = x | y;

            // Print the results in decimal and binary form
            System.out.println("x: " + x + ", Binary: " + Integer.toBinaryString(x));
            System.out.println("y: " + y + ", Binary: " + Integer.toBinaryString(y));
            System.out.println("z (x | y): " + z + ", Binary: " + Integer.toBinaryString(z));
        }
    }


