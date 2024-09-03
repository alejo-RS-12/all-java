import java.util.Arrays;

public class otro_ejemplo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 12, 13, 14, 15, 16, 16, 17};

        int eliminados = eliminarRepetidos(arreglo);
        System.out.println("Se eliminaron " + (-eliminados) + " números repetidos.");

        System.out.println("Arreglo resultante:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

    public static int eliminarRepetidos(int[] arreglo) {
        int eliminados = 0;
        int tamaño = arreglo.length;

        for (int i = 0; i < tamaño; i++) {
            for (int j = i + 1; j < tamaño; j++) {
                if (arreglo[i] == arreglo[j]) {
                    eliminados++;
                    arreglo[j] = arreglo[tamaño - 1];
                    tamaño--;
                    j--;
                }
            }
        }

        return eliminados;
    }
}
