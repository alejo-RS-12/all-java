public class analisis2_3 {
	public static void main(String []args){
		char letra=’a’;//uso de comillas para el valor inecesario
		
		obtenerCaracter(letra);
		if (letra>=‘a’ && letra<=‘z’){
		System.out.println(“Es una letra minuscula”);
		}
	}
		public static char obtenerCaracter(char letra, int numero){
			char letra = ‘ ’;//sin comillas para el valor vacio
			try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));// falta el inicio de los buffered e inputstream
			
			System.out.println("Ingrese un NRO entero: ");
			letra = entrada.readLine().charAt(0);
			}
			catch (Exception exc) {
			System.out.println("error");
		}
		return letra;
	}
}