/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario una posición
fila, columna y realice un corrimiento a izquierda.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio3_6 {
	final static int Maxfilas = 5;
	final static int Maxcolumnas = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fila;
		int columna;
		int[][] matrint = {
				{1,2,3,4,5,6,7,8,9,10},
				{11,12,13,14,15,16,17,18,19,20},
				{21,22,23,24,25,26,27,28,29,30},
				{31,32,33,34,35,36,37,38,39,40},
				{41,42,43,44,45,46,47,48,49,50}
			};
		try{
	
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese la posicion de la fila: ");
			fila = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese la posicion de la columna: ");
			columna = Integer.valueOf(entrada.readLine());
			
			corrimiento_izquierda(matrint, fila, columna);
			System.out.println("matriz con corrimiento izquierda");
			imprimir_matriz(matrint);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void corrimiento_izquierda(int [][] matrint, int fila, int columna){
		int temp = matrint[fila][columna];
		for(int i = columna; i < Maxfilas - 1; i++){
			matrint[fila][i] = matrint[fila][i+1];
		}
		matrint[fila][Maxfilas-1] = temp;
	}
	public static void imprimir_matriz(int[][] matrint){
		for (int i = 0; i<Maxfilas; i++ ){
			for(int j = 0; j<Maxcolumnas; j++){
				System.out.println(matrint[i][j] + " " );
			}
			System.out.println();
		}
		System.out.println();
	}
	

}
