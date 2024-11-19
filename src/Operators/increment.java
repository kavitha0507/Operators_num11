package Operators;

public class increment {

        public static void main(String[] args) {
            // Declare an integer variable and assign a value to it
            int num = 5;

            // Print the initial value
            System.out.println("Initial value: " + num);

            // Increment using the postfix increment operator
            num++;
            System.out.println("After postfix increment (num++): " + num);

            // Increment using the prefix increment operator
            ++num;
            System.out.println("After prefix increment (++num): " + num);

            // Increment using the addition assignment operator
            num += 1;
            System.out.println("After addition assignment (num += 1): " + num);

            // Another round of increments for demonstration
            num++;
            System.out.println("After another postfix increment (num++): " + num);

            ++num;
            System.out.println("After another prefix increment (++num): " + num);

            num += 1;
            System.out.println("After another addition assignment (num += 1): " + num);
        }
    }






