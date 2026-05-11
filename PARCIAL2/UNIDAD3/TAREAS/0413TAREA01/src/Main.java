
public class Main {
    public static final int NUMBER = 5;

    public static void main(String[] args) {

        IterableFactorial iterableFactorial = new IterableFactorial(NUMBER);

        iterableFactorial.start();
        System.out.println("El factorial recursivo de "+NUMBER+" es: " + RecursiveFactorial.factorial(NUMBER));

    }
}