public class RecursiveFactorial {
    public static long factorial(int number) {
        if (number==1 || number==0) {
            return 1;
        }
        return number * factorial(number-1);
    }
}
