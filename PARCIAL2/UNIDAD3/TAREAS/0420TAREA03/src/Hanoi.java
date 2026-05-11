public class Hanoi {
    public static void TorreHanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        TorreHanoi(n - 1, origen, destino, auxiliar);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        TorreHanoi(n - 1, auxiliar, origen, destino);
    }

    public static void main(String[] args) {
        int nDiscos = 4;
        System.out.println("Solución para " + nDiscos + " discos:");
        TorreHanoi(nDiscos, 'A', 'B', 'C');
    }

}
