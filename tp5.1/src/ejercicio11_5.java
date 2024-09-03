/*Hacer un programa que dado un arreglo de enteros de tama�o
10 que se encuentra precargado, solicite al usuario un n�mero
entero y elimine todas las ocurrencia de n�mero en el arreglo.
Mientras exista (en cada iteraci�n tiene que buscar la posici�n
dentro del arreglo) tendr� que usar la posici�n para realizar un
corrimiento a izquierda (quedar�n tantas copias de la �ltima*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio11_5 {
	final static int max = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrentero ={1,2,3,4,5,6,7,8,9,10};
		int numero;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			imprimir_arreglo(arrentero);
			int [] nuevo_arreglo = eliminar_ocurriencias (arrentero, numero);
			System.out.println("arreglo des�es de eliminar las ocurriencas:  " );
			for(int i = 0; i < max; i++){
				System.out.println("nombre_arreglo: " + nuevo_arreglo[i]);
			}
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void imprimir_arreglo(int[]arr){
		for (int i = 0; i<max; i++){
			System.out.println("nombre_arreglo: " + arr[i]);
		}
	}
	public static int [] eliminar_ocurriencias(int [] arr, int numero) {
		int contador = 0;
		int [] nuevoArreglo = new int[max - contador];//crea un nuevo arreglo 
		int index = 0;
		//cuenta las ocurriencias que hay en el arreglo
		for(int i = 0; i<max; i++){
			if(arr[i] == numero){
				contador++;
			}
		}//copia los elementos que no son iguales del numero al nuevo arreglo
		for (int i = 0; i < max; i++){
			if(arr[i] != numero){
				nuevoArreglo[index] = arr[i];
				index++;
			}
		}
		return arr;
	}
}
