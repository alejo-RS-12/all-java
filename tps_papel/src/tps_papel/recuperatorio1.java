package tps_papel;
/*tema 1: Se tiene una matriz precargada con secuencias de enteros distintos de cero en sus filas. Se pide guardar en un
arreglo los números de filas de las primeras 4 filas que cumplen con la condición de tener a lo sumo 5 secuencias sin
orden ascendente.
Observaciones: _el tamaño arreglo es igual a la cantidad de filas de la matriz, y está inicializado con -1,
_las secuencias están separadas por uno o más ceros, empiezan y terminan con uno o más ceros,
_realizar el programa completo sin realizar métodos de carga e impresión de matriz, ni utilizar
estructuras auxiliares.*/
public class recuperatorio1 {
	final static int MAXFILA = 10;
	final static int MAXCOLUMNA = 30;
	final static int MAXDES = 5;
	final static int PRIMFILAS = 4;
		public static void main(String[] args) {
			int [][] matint;
			int [] arrint;
			matint = new int[MAXFILA][MAXCOLUMNA];
			arrint = new int[MAXFILA];
			agregar_filas(matint,arrint);
		}
		public static void agregar_filas(int[][] mat,int[] arr){
			int fila,cant;
			fila = 0;
			cant = 0;
			while ((fila < MAXFILA)&&(cant < PRIMFILAS)){
				if (a_lo_sumo_cant_secuencias_sin_orden(mat[fila])){
					arr[cant] = fila;
					cant++;
				}
				fila++;
			}
		}
		public static boolean a_lo_sumo_cant_secuencias_sin_orden(int[] arr){
			int inicio,fin,cant;
			inicio = 0;
			fin = -1;
			cant = 0;
			while ((cant <= MAXDES)&&(inicio < MAXCOLUMNA)){
				inicio = obtener_inicio_secuencia(arr,fin+1);
				if (inicio < MAXCOLUMNA){
					fin = obtener_fin_secuencia(arr,inicio)-1;
					if (!secuencia_ordenada(arr,inicio,fin)){
					cant++;
					}
				}
			}
			return (cant <= MAXDES);
		}
		public static int obtener_inicio_secuencia(int [] arr, int pos){
			while ((pos < MAXCOLUMNA)&&(arr[pos] == 0)){
				pos++;
			}
			return pos;
		}
		public static int obtener_fin_secuencia(int [] arr, int pos){
			while ((pos < MAXCOLUMNA)&&(arr[pos] != 0)){
				pos++;
			}
			return pos;
		}
		public static boolean secuencia_ordenada(int[] arr, int inicio, int fin){
			while ((inicio < fin)&&(arr[inicio] < arr[inicio+1])){
				inicio++;
			}
			return (inicio == fin);
		}
}
