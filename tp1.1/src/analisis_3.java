import java.io.BufferedReader;
import java.io.InputStreamReader;
public class analisis_3 {
	public static void main(String[] args){
		int entero;
		BufferedReader entrada = new BufferedReader(new
			InputStreamReader(System.in));
			try {
				System.out.println ("Ingrese un entero: ");
				System.out.println ("Nro ingresado: " +
				
				entero);
			}
			catch (Exception exc ) {
				System.out.println(exc);
			}
	}
}//el buffered esta mal inicializado y la variable entero no tiene nada 