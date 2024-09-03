public class analisis3_2{
	public static void main(String[] args) {
		final int MAX=100;// esta mal declarado el valor maximo
		int valor=5;
		while (valor<MAX)
		System.out.println("Valor es: " + valor);
		
	}// el uso de while en este caso rompe el codigo haciendo que imprima al infinito el valor es :5
}