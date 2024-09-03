package tps_papel;
/*Escribir un programa que dado tres números reales ingresados
por el usuario, divida el primero por el segundo y al resultado
obtenido le reste el tercero. Muestre por pantalla el resultado
obtenido. Puede o no usar variables auxiliares para los cálculos.
Tenga en cuenta posibles errores en las operaciones.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejerciciotp1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, cantidad, edad;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero real: ");
			numero = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese una cantidad en numeros reales: ");
			cantidad = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese una edad en numeros reales: ");
			edad = Integer.valueOf(entrada.readLine());
			System.out.println("el resultado obtenido es: " + (numero/cantidad-edad));
			
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
