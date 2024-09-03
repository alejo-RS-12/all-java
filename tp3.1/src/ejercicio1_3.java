/*Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otro número y lo
imprima.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero; //el usurario ingresa un numero 
		int numero2;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un numero distinto de 0: ");
			numero = Integer.valueOf(entrada.readLine());
			numero2 = Integer.valueOf(entrada.readLine());
			if (numero != 0){
				System.out.println("el numero es distionto de 0: " + numero2);
			}
			else
				System.out.println("el numero es igual a 0");
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}

}
