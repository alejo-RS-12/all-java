/*Escribir un diseño de programa que mientras que el usuario
ingrese un carácter dígito o carácter letra minúscula, imprima
dicho carácter, y si es carácter letra minúscula, imprima si es vocal
o consonante.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un carater: ");
			a = entrada.readLine().charAt(0);
			switch(a){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("es una vocal: " + a);
				break;
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'ñ':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				System.out.println("es una consonante: " +  a);
				break;
				default:
					System.out.println("no es ni vocal ni consonanteS");
			}
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}

}
