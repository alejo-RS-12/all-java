l/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, obtenga la cantidad de números pares
que tiene y la imprima*/
import java.util.Random;
public class ejercicio6_5 {
	final static int max = 10;
	/*final static int Maxvalor = 10;
	final static int Minvalor = 1;*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrentero = new int [max];
		int cantidad = 0;
		cargar_arreglo_entero(arrentero);
		imprimir_arreglo_entero(arrentero);
		for(int i = 0; i < max; i++){
			if(arrentero[i] % 2 == 0){
				cantidad++;
			}
		}
		System.out.println("la cantidad de numeros pares es: " + cantidad);
	}
	public static void cargar_arreglo_entero(int[] arr){
		Random r = new Random();
		for (int i = 0; i < max; i++){
			arr[i]=(r.nextInt(100));//genera numero hasta el 100
		}
	}
	public static void imprimir_arreglo_entero(int [] arr){
		for(int i = 0; i < max; i++){
			System.out.println("nombre_arreglo[" + i +"]=" + arr[i] );
		}
	}
	
}
