
public class BusquedaBinaria {

    public static int BusquedaBinariaRecursivo(int[] arreglo, int valor, int inicio, int fin) {
        if (inicio > fin) {
            return -1;
        }

        int medio = inicio + (fin - inicio)  / 2;

        if (arreglo[medio] == valor) {
            return medio;
        }

        if (arreglo[medio] > valor) {
            return BusquedaBinariaRecursivo(arreglo, valor, inicio, medio - 1);
        } else {
            return BusquedaBinariaRecursivo(arreglo, valor, medio + 1, fin);
        }
    }

    public static int BusquedaBinariaIterativo(int[] arreglo, int valor) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arreglo[medio] == valor) {
                return medio;
            }

            if (arreglo[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arreglo = new int[40];
        for (int i = 1; i <= 40; i++) {
            arreglo[i-1]= i*2;
        }

        int valorEncontrado = 30;
        int valorNoEncontrado = 31;

        int resultadoIterativoEncontrado = BusquedaBinariaIterativo(arreglo, valorEncontrado);
        int resultadoRecursivoEncontrado = BusquedaBinariaRecursivo(arreglo, valorEncontrado, 0, arreglo.length - 1);
        int resultadoIterativoNoEncontrado = BusquedaBinariaIterativo(arreglo, valorNoEncontrado);
        int resultadoRecursivoNoEncontrado = BusquedaBinariaRecursivo(arreglo, valorNoEncontrado, 0, arreglo.length - 1);

        System.out.println("=== Prueba de busqueda binaria ===");
        System.out.println("Valor buscado (encontrado): " + valorEncontrado);
        System.out.println("Iterativo: " + resultadoIterativoEncontrado);
        System.out.println("Recursivo: " + resultadoRecursivoEncontrado);
        System.out.println();
        System.out.println("Valor buscado (no encontrado): " + valorNoEncontrado);
        System.out.println("Iterativo: " + resultadoIterativoNoEncontrado);
        System.out.println("Recursivo: " + resultadoRecursivoNoEncontrado);
    }
}
