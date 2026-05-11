
public class Main {
    static final int N = 8;

    public static void main(String[] args) {
        int[][] tablero = new int[N][N];

        if (OchoReinas.resolver(tablero, 0)) {
            OchoReinas.imprimir(tablero);
        } else {
            System.out.println("No hay solución");
        }
    }
}