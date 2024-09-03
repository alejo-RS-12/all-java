/*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada, permita obtener a través de
métodos la posición de inicio y la posición de fin de la secuencia
ubicada a partir de una posición entera y una fila, ambas
ingresadas por el usuario. Finalmente, si existen imprima por
pantalla ambas posiciones obtenidas.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio10_6 {
	final static int Maxfilas = 5;
	final static int Maxcolumnas = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fila;
		int ini; 
		int [][] matrint = {
				{0,1,33,2,44,3,26,4,9,0},
				{0,5,54,6,45,7,27,8,10,0},
				{0,11,0,12,0,13,0,14,20,0},
				{0,15,0,16,0,17,0,18,19,0},
				{0,21,0,22,0,23,0,24,25,0}
		};
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero entero de 0-9: ");
			ini = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese un numerode fila 1-5: ");
			fila = Integer.valueOf(entrada.readLine());
			System.out.println("matriz original: ");
			
			imprimir_matriz(matrint);
			
			int obtener_inicio = obtener_posicion_inicio(matrint, ini, fila);
			int obtener_fin = obtener_posicion_fin(matrint, obtener_inicio, fila);
			
			System.out.println("posicion de inico: " + obtener_inicio);
			System.out.println("posicion fin: " + obtener_fin);
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}

	}//obtener inicio de la secunencia 
	public static int obtener_posicion_inicio(int [][]matrint, int ini, int fila){
		int inicio = -1;
		for(int i = ini; i >=0; i--){
			if(matrint[fila-1][i] == 0){
				inicio= i+1;
				break;
			}
		}
		return inicio;
	}
	public static int obtener_posicion_fin(int[][]matrint, int obtener_inicio, int fila){
		int fin = -1;
		for(int i = obtener_inicio; i<Maxcolumnas; i++){
			if(matrint[fila-1][i] == 0){
				fin = i-1;
				break;
			}
		}
		return fin;
	}
	
	public static void imprimir_matriz(int [][] matrint){
		for(int i = 0; i<Maxfilas; i++){
			for(int j = 0; j<Maxcolumnas; j++){
				System.out.println(matrint[i][j] + " ");
			} 
			System.out.println();
		}
	}

}
