public class OchoReinas {
    static final int N = 8;

    static boolean resolver(int[][] tablero, int fila) {
        if (fila == N) {
            return true;
        }
        for (int col = 0; col < N; col++) {
            if (esSeguro(tablero, fila, col)) {
                tablero[fila][col] = 1;
                if (resolver(tablero, fila + 1)) {
                    return true;
                }
                tablero[fila][col] = 0;
            }
        }

        return false;
    }

    static boolean esSeguro(int[][] tablero, int fila, int col) {
        for (int i = 0; i < fila; i++) {
            if (tablero[i][col] == 1) {
                return false;
            }
        }

        for (int i = fila - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        for (int i = fila - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static void imprimir(int[][] tablero) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tablero[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }
}
