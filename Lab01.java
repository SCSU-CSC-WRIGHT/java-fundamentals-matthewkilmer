//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Exercise 1: Print Hello, World!
public class Lab01 {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("Hello, World!");

        // Exercise 2
        int x = 10;
        String message = "The number is: " + x;
        System.out.println(message);

        // Exercise 3
        int number = 15;
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Exercise 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Exercise 5
        System.out.println(greet("Matt"));

        // Exercise 7
        int[] numbers = {1,2,3,4,5};
        for (int num : numbers) {
            System.out.println(num);
        }
            // Exercise 8
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero is not allowed");
        }

    }
    public static String greet( String name) {
        return "Hello, my name is " + name + '!';
    }
}

