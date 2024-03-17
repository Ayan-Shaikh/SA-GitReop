package Calculator;

import java.util.Scanner;


public class Calculatorclass {
	
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        Calculatorclass calculator = new Calculatorclass();
        System.out.println("Sum: " + calculator.sum(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        try {
            System.out.println("Division: " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close(); // Close the Scanner to release resources
    }
}
