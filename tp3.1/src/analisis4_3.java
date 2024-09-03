/*a. Escribir un programa que llame un método que calcule el
promedio de la suma de valores enteros entre 1 y 1000.
Finalmente, el promedio debe mostrarse por pantalla*/
public class analisis4_3 {
	public static final int MAX = 1, MIN = 1000;// variables absolutas estan al reves 
		public static void main(String[] args) {
		System.out.println("El promedio de la suma entre " MIN " y
		" MAX " es "+ calcular_promedio());"
		// mal intepretacion del print 
		public static char calcular_promedio(int MAX, int MIN) {
			int suma = 0;
			
			int numero = MIN;// le valor del min deberia ser 1 para que este metodo funcione bien
			for (; numero <= MAX; numero++) {
			suma += numero;
			}
			return suma/(MAX-MIN+1);
		}
}