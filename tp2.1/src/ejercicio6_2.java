/*Escribir un programa que mientras el usuario ingrese un número
entero menor que 100 y mayor a 1, muestre por pantalla si el
número es múltiplo de 2 y múltiplo de 3 simultáneamente.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
		while((numero < 100) && (numero > 1)){
			if (numero % 2 ==0 && numero % 3 ==0){
				System.out.println("el numero es multiplo de 2 y 3: ");
			}
			else{
				System.out.println("el numero no es multiplo de ninguno");;
			}
		}
		}catch(Exception exc){
			System.out.println(exc);
			
		}
	}

}
