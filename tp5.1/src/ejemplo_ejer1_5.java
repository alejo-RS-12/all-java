import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejemplo_ejer1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max = 15;
		 int[] arreglo = new int[max];
		 int valor;

	      BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));

	        System.out.println("Ingrese valores entre 1 y 12 para cargar el arreglo:");

	        for (int i = 0; i < max; i++) {
	            try {
	                System.out.print("Valor " + (i + 1) + ": ");
	               valor = Integer.valueOf(entrada.readLine());

	                if (valor < 1 || valor > 12) {
	                    System.out.println("El valor ingresado debe estar entre 1 y 12. Intente nuevamente.");
	                    i--; // Reintentar la carga del valor actual
	                    continue;
	                }

	                arreglo[i] = valor;
	            } catch (Exception exc) {
	                System.out.println(exc);
	                i--; // Reintentar la carga del valor actual
	            }
	        }

	        System.out.println("\nEl arreglo quedó cargado de la siguiente manera:");

	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.println("Posición " + (i + 1) + ": " + arreglo[i]);
	        }
	}

}
