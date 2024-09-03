/*Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max = 15;
		int [] arrDatos = new int [max];
		int valor;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese valores es para cargar el arreglo: ");
			for(int pos = 0; pos < max; pos++){
				valor = Integer.valueOf(entrada.readLine());
				System.out.println("valor " + (pos + 1) + ": " );	
				if(valor <= 1 || valor >= 12){
					System.out.println("el valor ingresado debe ser mayor a 1 y menos a 12: ");
					pos--;
					continue;
				}		
				arrDatos[pos] = valor;
			}
		}
		catch (Exception exc){
		System.out.println(exc);
		}
		System.out.println("el arreglo quedo de la siguiente forma: " );
		for (int pos = 0; pos < max; pos++){
				System.out.println("arrDatos["+ pos +"] ->" + arrDatos[pos]);
		}
	}

}
