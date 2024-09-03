package tps_papel;
/*Escribir un programa que solicite nombre, edad, altura y ocupación, y
los imprima por pantalla.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejerciciotp1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String ocupacion;
		int edad;
		Double altura;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ingresar un nombre: ");
			nombre = entrada.readLine();
			System.out.println("ingrese una edad: ");
			edad = Integer.valueOf(entrada.readLine());
			System.out.println("ingrese una altura: ");
			altura = Double.valueOf(entrada.readLine());
			System.out.println("ingrese una ocupacion: ");
			ocupacion = entrada.readLine();
			System.out.println("los datos solicitados son :" + nombre + edad + altura + ocupacion );

		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
