/*Escribir un programa que declare una constante de tipo int y pida el
ingreso de un valor por teclado. Luego muestre el valor ingresado.
¿Qué pasa en este caso? ¿Se puede o surge algún problema?*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int numero = 4;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese valor: ");
			//numero = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
//no se puede ejecutar porque hay una constante declarada y no se puede cmabiar 
