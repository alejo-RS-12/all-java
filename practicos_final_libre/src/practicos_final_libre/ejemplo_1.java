package practicos_final_libre;

/* escribir un programa que mientras el usuario ingrese un numero num que sea multiplo de 7 y de 11, pida ingresar num caracteres,
 y por cada caracter ingresado imprima:
 "letra minuscila" si esl caracter es una letra del abecedario en minuscula
 "letra mayuscula" si el caracter es una letra del abecedario en mayuscula
 "digito" si el caracter corresponde a un caracter numero
 "otro" para los resultados restantes */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejemplo_1{
	public static void main (String[]args){
		int num = 0;
		char caracter;
		try{
			BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
			
			System.out.println("ingrese un numero muliplo de 7 y 11");
					num = Integer.valueOf(entrada.readLine());
					while((num%7 != 0)|| (num%11 != 0));
			
			for(int i = 0; i<num; i++){
				System.out.println("ingrese un caracter");
				caracter = entrada.readLine().charAt(0);
				  if (caracter >= 'a' && caracter <= 'z') {
			            System.out.println("Es una letra minúscula");
			        } else if (caracter >= 'A' && caracter <= 'Z') {
			            System.out.println("Es una letra mayúscula");
			        } else if (caracter >= '0' && caracter <= '9') {
			            System.out.println("Es un dígito");
			        } else {
			            System.out.println("Es otro carácter");
			        }
				
			}
		}
		catch(Exception exc){
			System.out.print(exc);
		}
	}
}