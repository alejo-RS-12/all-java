/*Escribir un programa que mientras que el usuario ingrese un
número entero distinto de 0, pida ingresar otro número entero y lo
imprima.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejerciocio8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un numero1: ");
			numero1 = Integer.valueOf(entrada.readLine());
			if (numero1 != 0){
				System.out.println("numero1 es distinto de cero: ");
			}
			else{
				numero2 = Integer.valueOf(entrada.readLine());
				System.out.println("numero2 es: " + numero2);
			}
		}catch (Exception exc){
			System.out.println(exc);
		}
	}

}
