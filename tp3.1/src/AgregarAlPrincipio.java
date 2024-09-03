import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AgregarAlPrincipio {
    public static void main(String[] args){
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numero;
        try{
        	BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        	System.out.print("Ingrese un número entero: ");
        	numero = Integer.parseInt(entrada.readLine());
        	
        	int[] nuevoArreglo = agregarAlPrincipio(arreglo, numero);
        	
        	System.out.print("Arreglo después de agregar el número: ");
        	for (int i = 0; i < nuevoArreglo.length; i++) {
        		System.out.print(nuevoArreglo[i] + " ");
        	}
        }
        catch(Exception exc){
        	System.out.println(exc);
        }
    }

    public static int[] agregarAlPrincipio(int[] arreglo, int numero) {
        for (int i = arreglo.length - 1; i > 0; i--) {
            arreglo[i] = arreglo[i - 1];
        }

        arreglo[0] = numero;

        return arreglo;
    }
}
