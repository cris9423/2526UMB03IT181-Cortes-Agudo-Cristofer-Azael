public class IterableFactorial extends Thread{
    private int number;
    private long factorial;

    public IterableFactorial(int number) {
        this.number = number;
        this.factorial = 1;
    }

    public long getFactorial() {
        return factorial;
    }

    @Override
    public void run() {
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("El factorial iterable de " + number + " es " + factorial);
    }

}
