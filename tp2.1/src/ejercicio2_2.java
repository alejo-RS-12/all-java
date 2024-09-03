/*Construir un programa que solicite desde teclado un n�mero de
mes y posteriormente notifique por pantalla la cantidad de d�as de
ese mes. En el caso de que ingrese 2 como n�mero de mes
(febrero) deber� adem�s solicitar ingresar un n�mero de a�o, y
dependiendo si es bisiesto o no con la siguiente sentencia:
((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
imprimir la cantidad de d�as correspondiente.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeromes;
		int numeroanio;
		int numerodia;
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un numero de mes: ");
			numeromes = Integer.valueOf(entrada.readLine());
			switch(numeromes){
			case 1:
				break;
			case 2:
				System.out.println("ingrese un numero de a�o: ");
				numeroanio = Integer.valueOf(entrada.readLine());
				if ((numeroanio % 4 == 0) && ((numeroanio % 100 != 0) || (numeroanio % 400 == 0))){
					numerodia = 29; // a�o bisiesto
				}else{
					numerodia = 28; //a�o no bisiesto
				}
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				numerodia = 30; // dias del mes
				break;
			default:
				numerodia = 31; // dias del mes
				break;
			}
			/*System.out.println("numero del mes: "+  numeromes + " dia del mes: " + numerodia);en numero dia se almacenan los dias del mes */
			
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}

}
