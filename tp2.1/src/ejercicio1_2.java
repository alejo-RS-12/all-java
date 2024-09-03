/*Escribir un programa completo (declaraci�n de constantes y
variables, carga de datos, procesamiento e impresi�n de
resultados) para cada caso o �tem que:
a. solicite un n�mero e indique si es positivo o negativo.
b. solicite un n�mero e imprima �grande� si es mayor a 100 y
�chico � si es menor.
c. solicite un n�mero del 1 al 7 e imprima el d�a de la semana.
d. solicite una letra e imprima si es vocal o consonante.
e. solicite 3 n�meros e imprima �creciente� si los tres n�meros
est�n en orden creciente, �decreciente� si est�n en orden
decreciente o �error� si no cumplen ning�n orden*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1_2{

	public static void main(String[] args) {
		final int max = 100;
		int numero1;
		int numero2;
		int numero3;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero positivo o negativo: ");
			numero1 = Integer.valueOf(entrada.readLine());
			if (numero1 >= 0) {  //si numero1 es + imprima,
				System.out.println("numero1 es positivo: " +  numero1);
			}
			else{
				System.out.println("numero1 es negativo: " + numero1);
			}
			System.out.print("ingrese un numero: ");
			numero2 = Integer.valueOf(entrada.readLine());
			if(numero2 >= max){
				System.out.println("numero2 es grande :" + numero2);
			}
			else{
				System.out.println("numero2 es chico: " + numero2);
			}
			System.out.println("ingrese un numero del 1 al 7: ");
			numero3 = Integer.valueOf(entrada.readLine());
			switch(numero3){
				case 1:
					System.out.println("lunes");
					break;
				case 2:
					System.out.println("martes");
					break;
				case 3:
					System.out.println("miercoles");
					break;
				case 4:
					System.out.println("jueves");
					break;
				case 5:
					System.out.println("viernes");
					break;
				case 6:
					System.out.println("sabado");
					break;
				case 7:
					System.out.println("domingo");
					break;
				default: System.out.println("dia se la semana: " + numero3);
			}
		}
		catch(Exception exc){
			System.out.println(exc);
			}
	}
}