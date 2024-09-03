/*Escribir un programa que mientras el usuario ingresa un caracter
distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
si es carácter vocal minúscula.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		char letra;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un caracter o numero: ");
			letra = entrada.readLine().charAt(0);
			
			if (letra != '*'){
				
			}
			switch(letra){
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				System.out.println("es una digito");
				break;
			case 'a':
 			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("es una vocal minuscula");
				break;
			default: 
				System.out.println("no es ni vocal ni minuscula");
				break;
			}
		}
		catch(Exception exc){
			System.out.println(exc);
		}
	}

}
