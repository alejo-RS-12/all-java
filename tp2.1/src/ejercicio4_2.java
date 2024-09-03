/*Escribir un programa donde el usuario ingrese un número entre 0
y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
tiene 3 dígitos debe informar qué número es.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio4_2 {

	public static void main(String[] args) {
		int numero = 0;
		int cantidadDigitos = contadorDigitos(0);
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un numero mayor a 0 y menos a 999: ");
			numero = Integer.valueOf(entrada.readLine());
			//System.out.println("valor del numero: " + numero);
			if (numero >= 0 && numero <=999){
				System.out.println("numero ingresado tiene: " + cantidadDigitos + " digitos");
				if (cantidadDigitos == 3){
					System.out.println("el numero ingresado es: " + numero);
				}
			}else{
				System.out.println("el numero ingresado esta fuera del rango establecido");
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}
	public static int contadorDigitos(int numero){
		int contador = 0;
		/*if (numero == 0){
			return 1; // si el numero es 0 se conincidera que tiene un solo digito
		}*/
		while (numero != 0){
			numero = numero / 10;
			contador++;
		}
		return contador;
	}
}
