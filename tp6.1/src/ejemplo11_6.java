public class ejemplo11_6 {
public static final int MAXCOLUMNA = 20;
public static final int MAXFILA = 4;
    public static void main(String[] args) {
        int [][] matriz = {{0,9,3,4,5,6,7,8,0,1,2,5,3,0,1,6,3,0,9,0},
        				   {0,2,1,1,1,6,2,8,0,1,2,5,3,0,9,9,8,0,9,0},
                		   {0,2,7,4,5,6,7,8,0,1,2,5,3,0,1,6,3,0,9,0},
                		   {0,2,3,4,0,6,7,8,0,9,10,7,6,0,1,6,3,0,9,0}};
        recorrer_filas(matriz);
}
                        
    public static void recorrer_filas(int[][] matriz) {
        for (int i = 0; i < MAXFILA; i++) {
        buscarInicioFinMayor(matriz[i]);
        }
    }

    public static void buscarInicioFinMayor(int []arr) {
        int inicio = 0, fin = -1, suma = 0, sumaMayor = 0, inicioMayor = 0, finMayor = 0;
        while(inicio < MAXCOLUMNA){
            inicio = obtenerInicio(arr, fin + 1);
            if (inicio < MAXCOLUMNA){
                fin = obtenerFin(arr, inicio); 
                suma = calcularSuma(arr, inicio, fin);
                if(suma > sumaMayor){
                    sumaMayor = suma;
                    inicioMayor = inicio;
                    finMayor = fin;  
                }
            }
        }
        System.out.println("la secuencia cuyo elementos tiene mayor suma empieza en: " + inicioMayor + " y finaliza en: " + finMayor);
    }
    
    public static int calcularSuma(int[] arr, int ini, int fin) {
         int suma = 0;
         for (int i = ini; i <= fin; i++) {
             suma += arr[i];
         }
         return suma;
     }

    public static int obtenerFin(int[] arr, int ini) {
        int pos = ini;
        while (pos < MAXCOLUMNA && arr[pos] != 0) {
            pos++;
        }
        return pos - 1;
    }

    public static int obtenerInicio(int[] arr, int ini) {
        int pos = ini;
        while (pos < MAXCOLUMNA && arr[pos] == 0) {
            pos++;
        }
        return pos;
    }
}
