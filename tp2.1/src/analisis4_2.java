/*Dado un caracter ingresado por el usuario: imprimir si es
caracter min�scula, o imprimir si es car�cter may�scula, o
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
				System.out.println("Es car�cter min�scula");
			}
			if (('A'<=caracter)&&(caracter<='Z')) {
				System.out.println("Es car�cter may�scula");
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