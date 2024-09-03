public class parcial_4 {
    public static final int MAX = 20;
    public static final int pixelNegro = 0;
    public static final int ct2 = 2;
    public static final int X = 3;

    public static void main(String[] args) {
        int[] arr = { 0, 67, 67, 67, 67, 67, 67, 67, 67, 0, 13, 0, 33, 33, 33, 33, 0, 34, 22, 0 };
        comprimirSecuencias(arr);
        imprimir_arreglo(arr);
    }

    private static void comprimirSecuencias(int[] arr) {
        int inicio = 0, fin = 0;
        while (inicio < MAX) {
            inicio = obtener_incio(arr, fin + 1);
            if (inicio < MAX) {
                fin = obtener_fin(arr, inicio);
                if (fin < MAX) {
                    int tam = fin - inicio + 1;
                    if (tieneNumerosIguales(arr, inicio, fin) && tam > X) {
                        comprimirSecuencia(arr, inicio, fin);
                        fin = inicio + 1;
                    }
                }
            }
        }
    }

    private static void comprimirSecuencia(int[] arr, int inicio, int fin) {
        int tam = fin - inicio + 1;
        int valorNegativo = tam - (tam * 2);
        for (int i = inicio + ct2; i <= fin; i++) {
            corrimiento_izq(arr, inicio + ct2);
        }
        arr[inicio + 1] = valorNegativo;
    }

    private static void corrimiento_izq(int[] arr, int i) {
        while (i < MAX - 1) {
            arr[i] = arr[i + 1];
            i++;
        }
    }

    private static boolean tieneNumerosIguales(int[] arr, int inicio, int fin) {
        while (inicio < fin && arr[inicio] == arr[inicio + 1]) {
            inicio++;
        }
        return inicio == fin;
    }

    public static int obtener_incio(int[] arr, int pos) {
        while (pos < MAX && arr[pos] == pixelNegro) {
            pos++;
        }
        return pos;
    }

    public static int obtener_fin(int[] arr, int pos) {
        while (pos < MAX && arr[pos] != pixelNegro) {
            pos++;
        }
        return pos - 1;
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int i = 0; i < MAX; i++) {
            System.out.print(arr[i] + "|");
        }
    }
}