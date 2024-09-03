package practicos_final_libre;
/*Hacer un programa que dada la matriz de secuencias de caracteres definida y 
*precargada elimine todas las secuencias que tienen orden descendente entre sus elementos*/
public class ejemplo_3 {
final static int Maxfila = 3;
final static int Maxcolumna = 20;
final static int Max = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrint = {{0, 1, 2, 0, 3, 4, 0, 6, 5, 4, 3, 0, 0, 2, 3, 5, 0, 8, 5, 0},
                {0, 1, 5, 0, 3, 4, 0, 6, 8, 4, 3, 0, 0, 2, 3, 5, 0, 8, 5, 0},
                {0, 1, 2, 3, 3, 4, 0, 6, 5, 7, 3, 0, 0, 5, 2, 1, 0, 8, 9, 0}};
		imprimir_matriz(matrint);
		eliminar_secuencias_desendentes(matrint);
		imprimir_matriz(matrint);
		
	}
	public static void imprimir_matriz(int[][] mat){
		for(int fila = 0; fila < Maxfila; fila++){
			System.out.println("");
			for(int columna = 0; columna< Maxcolumna; columna++){
				System.out.println(mat[fila][columna] + "");
			}
			System.out.println();
		}
	}
	public static void eliminar_secuencias_desendentes(int[][]mat){
		for(int fila = 0; fila < Maxfila; fila++){
			eliminar_secuencuas_desendetes_fila(mat[fila]);
		}
	}
	public static void eliminar_secuencuas_desendetes_fila(int[]arr){
		int inicio, fin;
		inicio = 0;
		fin = -1;
		while(inicio < Max -1){
			inicio = obtener_inicio_secuencia(arr, fin+1);
			if(inicio < Max -1){
				fin = obtener_fin_secuencia(arr, inicio);
				if(es_descendente(arr, inicio, fin)){
					corrimiento_izquierda(arr, inicio, fin);
				}
			}
		}
	}
	public static boolean es_descendente (int[] arr, int inicio, int fin){
		int i = inicio;
		while((i < fin) && (arr[i+1] < arr[i])){
			i++;
		}
		return (i == fin);
	}
	public static int obtener_inicio_secuencia(int[] arr, int pos){
		while ((pos < Max - 1) && (arr[pos] == 0)){
			pos++;
		}
		return pos ;
	}
	public static int obtener_fin_secuencia(int[]arr, int pos){
		while ((pos < Max - 1) && (arr [pos] != 0)){
			pos++;
		}
		return pos - 1;
	}
	public static void corrimiento_izquierda(int[] arr, int inicio, int fin){
		int longitud = (fin + 1) - inicio;
		while(longitud > 0){
			for(int i = inicio; i < Max - 1; i++){
				arr[i] = arr[i + 1];
			}
			longitud--;
		}
	}
}
