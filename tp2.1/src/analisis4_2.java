/*Dado un caracter ingresado por el usuario: imprimir si es
caracter minúscula, o imprimir si es carácter mayúscula, o
imprimir no es caracter letra*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class analisis4_2 {
	public static void main(String[] args) {
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Ingrese un caracter :");
			caracter = entrada.readLine().charAt(0);
			if (('a'<=caracter)||(caracter<='z')) {
				System.out.println("Es carácter minúscula");
			}
			if (('A'<=caracter)&&(caracter<='Z')) {
				System.out.println("Es carácter mayúscula");
			}
			else {
				System.out.println("No es caracter letra");
				}//los if tienen que estar dentro del primero para que se cumpla la condicion de las letras minusculas, mayuscaluas o que no sea letra
			}
			catch (Exception exc){
			System.out.println(exc);
		}
	}
}