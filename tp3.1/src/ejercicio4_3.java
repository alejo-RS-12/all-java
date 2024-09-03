/*Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otros dos números
e imprima el resultado de la multiplicación entre los dos últimos
números ingresados.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;;
public class ejercicio4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, numero2, numero3;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un numero: ");
			numero1 = Integer.valueOf(entrada.readLine());
			if (numero1 != 0){
				System.out.println("el numero es distinto a 0: ");
			}
			else{
				System.out.println("ingrese dos numeros distintos a 0: ");
				numero2 = Integer.valueOf(entrada.readLine());
				numero3 = Integer.valueOf(entrada.readLine());	
				System.out.println("resultado de multiplicacion: " + numero2 * numero3);
			}
		}catch (Exception exc){
			System.out.println(exc);
		}
	}

}
