/*Escribir un programa que simule 1000 lanzamientos de un dado
y muestre por pantalla cuántas veces salió el valor del dado
correspondiente al número entero N ingresado por el usuario.
Considerar que el valor N ingresado se corresponda a un valor
posible para un dado. Usar la sentencia Math.random() que
devuelve un valor aleatorio real entre 0 y 1.
Para asignar un posible valor a la variable dado entero:

dado = (int) (6*Math.random() + 1)*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
public class ejercicio12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int[] contador = new int[6];
		try{
			BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("ingrese un numero: ");
			numero1 = Integer.valueOf(entrada.readLine());
			if((numero1 <= 6)|| (numero1 > 0)){
				Random random = new Random();
				for (int i = 0; i < 1000; i++){
					int contador_resultado = random.nextInt(6) + 1;
					contador[contador_resultado - 1]++;
					System.out.println("resultado de tiradas: " + contador_resultado);
					
				}
				for (int lado = 0; lado < contador.length; lado++){
						System.out.println("lado " + (lado + 1) + ": " + contador[lado] + "veces");
						//System.out.println("numero ingresado por el usuario es: " + numero1 + " posicion del dado: " + lado);//arreglar
				}
			}
			//imprimirDados();
		}
		catch(Exception exc){
			System.out.println(exc);
			}
	}
	
	/*metodo de tirar los dados 1000 veces y los almacene en un array
	public static void imprimirDados(){
		int[] contador = new int[6];
		Random random = new Random();
		for (int i = 0; i < 1000; i++){
			int contador_resultado = random.nextInt(6) + 1;
			contador[contador_resultado - 1]++;
			System.out.println("resultado de tiradas: " + contador_resultado);
			
		}
		for (int lado = 0; lado < contador.length; lado++){
			System.out.println("lado " + (lado + 1) + ": " + contador[lado] + "veces");
		}
		
	}*/
}
