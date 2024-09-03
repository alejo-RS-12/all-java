/*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada permita encontrar por cada fila la
posición de inicio y fin de la secuencia cuya suma de valores sea
mayor.*/
public class ejercicio11_6 {
	final static int Maxfilas = 5;
	final static int Maxcolumnas = 10;
	public static void main(String[] args) {
		int [][] matrint = {
				{2,1,33,2,44,3,26,4,9,2},
				{4,5,54,6,45,7,27,8,10,3},
				{0,11,0,12,0,13,0,14,20,0},
				{0,15,0,16,0,17,0,18,19,0},
				{0,21,0,22,0,23,0,24,25,0}
		};
		for(int fila = 0; fila<Maxfilas; fila++){//se reccorre cada fila de la matriz
			int posicion_inicio = obtener_inicio(matrint, fila);
			int posicion_fin = obtener_fin(matrint, fila);
			System.out.println("fila " + (fila +1) + ":");
			System.out.println("posicion de inicio: " + posicion_inicio);
			System.out.println("posicion de fin: " + posicion_fin);
			System.out.println();
		}
			
	}
	public static int obtener_inicio(int[][] matrint, int fila ){//recibe como parametro la fila actual
		int inicio = 0;
		int sumaMaxima = calcular_suma(matrint[fila], 0 ,Maxcolumnas);//se calcula el valor de la usma de las secuencias
		for(int i = 1; i < Maxcolumnas; i++){
				int suma_actual = calcular_suma(matrint[fila], i ,Maxcolumnas);
				if(suma_actual > sumaMaxima){
					sumaMaxima = suma_actual;
					inicio = i;
			}
		}
		return inicio;
	}
	public static int obtener_fin(int[][]matrint, int fila){
		int fin = 0;
		int sumaMaxima = calcular_suma(matrint[fila], 0, Maxcolumnas);
		for(int i = 1; i<Maxcolumnas; i++) {
			int suma_actual = calcular_suma(matrint[fila], i, Maxcolumnas);
			if (suma_actual > sumaMaxima){
				sumaMaxima = suma_actual;
				fin = i;
			}
		}
		return fin;
	}
	public static int calcular_suma(int[]fila, int obtener_inicio, int fin){
		int suma = 0;
		for(int i = obtener_inicio; i < fin; i ++){
			suma += fila[i];
		}
		return suma;
	}
		
	/*public static void imprimir_matriz(int [][] matrint){
		for(int i = 0; i<Maxfilas; i++){
			for(int j = 0; j<Maxcolumnas; j++){
				System.out.println(matrint[i][j] + " ");
			} 
			System.out.println();
		}
	}*/
	
}