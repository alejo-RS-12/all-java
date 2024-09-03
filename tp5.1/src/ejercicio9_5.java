/*Hacer un programa que dado un arreglo de enteros de tamaño 10
que se encuentra cargado, solicite al usuario un número entero y
lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada.*/
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio9_5 {
	final static int Maxvalor = 10;
	final static int Minvalor = 1;
	final static int max = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int [] arrentero = new int [10];
		try{
			BufferedReader entrada =  new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero entero: ");
			numero = Integer.valueOf(entrada.readLine());
			cargar_arreglo(arrentero);
			imprimir_arreglo(arrentero);
			int [] nuevo_arreglo = corrimiento_derecha(arrentero, numero);
			for(int i = 0; i < max; i++){
				System.out.println("nuevo_arreglo: " + nuevo_arreglo[i]);	
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static void cargar_arreglo(int [] arr){
		Random r = new Random();
		for(int i = 0; i < max; i++){
			arr[i] = (r.nextInt(Maxvalor-Minvalor+1) + Minvalor);
		}
	}
	public static void imprimir_arreglo(int [] arr){
		for(int i = 0; i<max; i++){
			System.out.println("nombre del arreglo[" + i +"] = " +arr[i]);
		}
	}
	public static int [] corrimiento_derecha(int []arr, int numero ){
		for(int i = max - 1; i > numero; i--){// for(int i = max +1; i>numero; i++) para hacer corrimiento izquierda
			arr[i] = arr[i-1];//arr[i] = arr[i+1] 
		}
		arr[0] = numero;
		return arr;
	}

}
