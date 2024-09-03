/*Buscar un elemento en un arreglo de caracteres ya cargado de
tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
estar indicarlo también.*/
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio4_5 {
	final static int max = 10;
	/*final static int Maxvalor = 10;
	final static int Minvslor = 1;*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char  [] arrchar = new char [max];
		int i;
		char caracter;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			cargar_arreglo_char(arrchar);
			imprimir_arreglo_char(arrchar);
			System.out.println("ingrese un caracter: ");
			caracter = entrada.readLine().charAt(0);
			i = obtener_posicion_arreglo(arrchar, caracter);
			if (i<max){
				System.out.println(caracter + " esta en " + i);
			}
			else{
				System.out.println("no existe " + caracter);
			}
		}
		catch(Exception exc) {
			System.out.println(exc);	
		}

	}//carga de arreglos char de la a a la z
	public static void cargar_arreglo_char(char [] arr){
		Random r = new Random();
		for (int i = 0; i < max; i++){
			arr[i]=(char) (r.nextInt(26) + 'a');
		}
	}
	public static void imprimir_arreglo_char(char[] arr){
		for(int i = 0; i <max; i++){
			System.out.println("nombre del arreglo["+i+"] = " + arr[i]);
		}
	}
	public static char obtener_posicion_arreglo(char [] arr, char caracter){
		int posicion = 0;
		while ((posicion < max ) && (arr[posicion] != caracter)){
			posicion++;
		}
		return (char) posicion;
	}
	
}
