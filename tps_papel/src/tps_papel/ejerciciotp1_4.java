package tps_papel;
/*Escribir un programa que permita ingresar 5 números de a uno por
vez y que los muestre por pantalla en orden inverso:
Ejemplo: Ingreso: 23, 4, 2, 100, 3
Se debe mostrar: 3, 100, 2, 4, 23*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejerciciotp1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, edad, cantidad, altura, metros;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingrese un numero: ");
			numero = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese una edad: ");
			edad = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese una cantidad: ");
			cantidad = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese una altura: ");
			altura = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese una medida entera de metros: ");
			metros = Integer.valueOf(entrada.readLine());
			System.out.println("los datos ingresados son: " + metros + altura + cantidad + edad + numero );
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
