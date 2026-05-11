
public class Main {
    public static final int NUMBER = 40;
    public static void main(String[] args) {
        System.out.println("Fibonacci iterativo de "+ NUMBER+ ": " + FibonacciIterativo.fibonacciIterative(NUMBER));
        System.out.println("Fibonacci recursivo de "+ NUMBER+ ": " + FibonacciRecursive.fibonacciRecursive(NUMBER));
    }
}