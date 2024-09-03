/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario un número
entero y elimine la primera ocurrencia de número en la matriz (un
número igual) si existe. Para ello tendrá que buscar la posición y si
está, realizar un corrimiento a izquierda y no continuar buscando.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio5_6 {
	final static int Maxfilas = 5;
	final static int Maxcolumnas = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int[][] matrint = {
				{1,2,3,4,5,6,7,8,9,10},
				{11,12,13,14,15,16,17,18,19,20},
				{21,22,23,24,25,26,27,28,29,30},
				{31,32,33,34,35,36,37,38,39,40},
				{41,42,43,44,45,46,47,48,49,50}
			};
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("inegrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			/*fila = Integer.valueOf(entrada.readLine());
			columna = Integer.valueOf(entrada.readLine());*/
			
			//si esxiste eliminar ocurriencia 
			boolean encontrado = false;
			for(int i = 0; i < Maxfilas; i++){
				for(int j = 0; j < Maxcolumnas; j++){
					if(matrint[i][j] == numero){
						corrimiento_izquierda(matrint, i,j, j);
						encontrado = true;
						break;
					}
				}
				if(encontrado){
					break;
				}
			}
			if(encontrado){
				System.out.println("la primera ocurriencia del numero ha sido eliminada: ");
			}
			else{
				System.out.println("el numero no se encontro en la matriz:");
			}
			System.out.println("matriz editada: ");	
			imprimir_matriz(matrint);
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void corrimiento_izquierda(int[][] matrint, int fila, int columna, int numero){
		for(int i = columna; i<Maxcolumnas - 1; i++){
			matrint[fila][i] = matrint[fila][i+1];
		}
		matrint[fila][Maxcolumnas-1] = 0;
	}
	public static void imprimir_matriz(int[][] matrint){
		for(int i = 0; i < Maxfilas; i++){
			for(int j = 0; j < Maxcolumnas; j++){
				System.out.println(matrint[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}