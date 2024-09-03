package tps_papel;
/*Escribir un programa que imprima por pantalla la tabla de verdad
para los operadores lógicos or y and (por separado) para dos
valores booleanos. Utilizar los operadores para calcular el
resultado. Por ejemplo, imprimir el siguiente caso para el operador
or:
false or true es: true
y se genera con:
System.out.println(“ false or true es: ” + (false || true));*/
public class ejerciciotp1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean valor1 = false;
	        boolean valor2 = true;

	        // Operador lógico AND (&&)
	        System.out.println("Tabla de verdad para el operador AND (&&):");
	        System.out.println(valor1 + " && " + valor2 + " es: " + (valor1 && valor2));
	        System.out.println(valor1 + " && " + !valor2 + " es: " + (valor1 && !valor2));
	        System.out.println(!valor1 + " && " + valor2 + " es: " + (!valor1 && valor2));
	        System.out.println(!valor1 + " && " + !valor2 + " es: " + (!valor1 && !valor2));

	        // Operador lógico OR (||)
	        System.out.println("\nTabla de verdad para el operador OR (||):");
	        System.out.println(valor1 + " || " + valor2 + " es: " + (valor1 || valor2));
	        System.out.println(valor1 + " || " + !valor2 + " es: " + (valor1 || !valor2));
	        System.out.println(!valor1 + " || " + valor2 + " es: " + (!valor1 || valor2));
	        System.out.println(!valor1 + " || " + !valor2 + " es: " + (!valor1 || !valor2));
	 
	}

}
