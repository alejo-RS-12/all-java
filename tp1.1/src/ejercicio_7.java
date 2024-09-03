/*Escribir un programa que dado tres números reales ingresados
por el usuario, divida el primero por el segundo y al resultado
obtenido le reste el tercero. Muestre por pantalla el resultado
obtenido. Puede o no usar variables auxiliares para los cálculos.
Tenga en cuenta posibles errores en las operaciones.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int peso;
		int altura;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			System.out.print("ingrese un peso: ");
			peso = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese una altura: ");
			altura = Integer.valueOf(entrada.readLine());
			System.out.println("resultado de division: numero / peso - altura= " + (numero / peso - altura) );
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
