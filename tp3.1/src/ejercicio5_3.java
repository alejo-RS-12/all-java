/*Hacer un método que dado un número entero con valor inicial 1,
haga una iteración incrementando el número de a uno hasta un
valor MAX = 4 (constante). Mientras itera deberá imprimir el
número. Luego invocarlo desde el programa principal y cuando
termina imprimir por pantalla “terminó”.*/
public class ejercicio5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max = 4;
		int numero = 1;
		System.out.println("iteracion hasta 4 del: " + numero);
		for(int i =1; i<=max; i++) {
			System.out.println( i);
			
		}
		System.out.println("termino");
	}

}
