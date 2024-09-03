/*Hacer un programa que elimine los valores pares en un arreglo
de tamaño MAX=10.*/
public class ejercicio14_5 {
	final static int max = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrentero ={1,2,3,4,5,6,7,8,9,10};
		System.out.println("arreglo original: ");
		imprimir_arreglo(arrentero);
		
		System.out.println("arreglo desúes de eliminar los pares:  " );
		
		eliminar_pares(arrentero);
		
		imprimir_arreglo(arrentero);
	}
	public static void eliminar_pares(int [] arr){
		int numero = 0;
		for(int i = numero; i < max - 1; i++){
			if(arr[i] % 2 != 0){
				arr[numero] = arr[i];
				numero++;
			}
		}
		for(int i = numero; i<max; i++){
			arr[i] = 0;// se rellena los espacios con 0
			
		}
	}
	public static void imprimir_arreglo(int[]arr){
		for (int i = 0; i<max; i++){
			System.out.println("nombre_arreglo: " + arr[i]);
		}
		System.out.println();
	}
}
