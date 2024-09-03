/*Escribir un programa que solicite el ingreso de un número mayor a
50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio3_2 {

	public static void main(String[] args) {
		int numero;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un numero mayor a 50: ");
			numero = Integer.valueOf(entrada.readLine());
			if(numero > 50){
				System.out.println("si el numero es mayor a 50 imprima: ");
				if (numero % 2 == 0 || numero % 3 == 0){
					System.out.println("numero es multiplo de dos o de tres: " + numero);
				}
				else{
					System.out.println("el numero no es multiplo de 2 ni de 3");
				}
			}
			else{
				System.out.println("el numero no es mayor a 50: ");
			}
		}catch(Exception exc){
			System.out.println(exc);
			
		}

	}

}
