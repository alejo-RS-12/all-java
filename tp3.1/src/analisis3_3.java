public class analisis3_3 {
	public static int numero = 2;// no es una sintaxis para dar un valor absoluto
		public static void main(String[] args) {
			int b = 3;
			{
			System.out.println (a + ", " + numero);// no se declaro la variable a
			int b = 2;// se utiliza dos veces el declaro de variables b
			int a = 5;
			System.out.println (a + ", " + b);
			{
			int c = 7;
			System.out.println (a + ", " + b + ", " + c);
			}
			System.out.println (a + ", " + b + ", " + c);// este print esta de mas
			}
	}
}