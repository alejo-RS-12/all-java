import java.io.BufferedReader;
import java.io.InputStreamReader;
public class pacial_1 {
	final static int max = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrentero = {255,1,1,1,1,1,1,1,255,5,5,5,5,255,7,8,9,5,3,5,255};
		int numero;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero entero:");
			numero = Integer.valueOf(entrada.readLine());
			imprimir_arreglo(arrentero); 
			int[] nuevo_arreglo = eliminar_numero(arrentero, numero);
			System.out.println("nuevo_arreglo: " + nuevo_arreglo[numero]);
			//imprimir_arreglo(nuevo_arreglo);
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}
	public static int[] eliminar_numero(int [] arr, int numero){
		int contador = 0;
		int[] nuevo_Arreglo = new int [max-contador];
		int fijo = 0;
		for(int i = 0; i<max; i++){
			if(arr[i] == numero){
				contador++;
			}
		}
		for (int i = 0; i<max; i++){
			if (arr[i] != numero){
				nuevo_Arreglo[fijo] = arr[i];
				fijo++;
			}
		}
		return arr;
	}
	public static void imprimir_arreglo(int [] arr){
		for(int i = 0; i<max; i++){
			System.out.println("nombre del arreglo: [" + i +"]=" + arr[i]);
		}
	}

}
