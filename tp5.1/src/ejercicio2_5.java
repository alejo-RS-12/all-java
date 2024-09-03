/*Hacer un programa que dado un arreglo ya cargado con 10
enteros, calcule el promedio y lo muestre por la consola.*/
import java.util.Random;
public class ejercicio2_5 {
	final static int max = 10;
	final static int MAXvalor = 10;
	final static int MINvalor = 1;

	public static void main(String[] args) {
		int [] arrint = new int [max];
		int promedio; 
		promedio = promedio_arreglo(arrint);
		cargar_arreglo(arrint);
		imprimir_arreglo(arrint);
		//promedio_arreglo(arrint);
		System.out.println("el promedio del arreglo es: " + promedio);
	}
	public static void cargar_arreglo(int [] arr){
		Random r = new Random();
		for(int i = 0; i < max; i++){
			arr[i] = (r.nextInt(MAXvalor-MINvalor+1) + MINvalor);
		}
	}
	public static int promedio_arreglo(int [] arr){
		int suma = 0;
		for (int i = 0; i < max; i++){
			suma += arr[i];
		}
		return (suma/max);
	}
	public static void imprimir_arreglo(int [] arr){
		for (int i = 0; i < max; i++){
			System.out.println("arreglo de enteros[" +i+ "] = "+arr[i]);
		}
	}
}
