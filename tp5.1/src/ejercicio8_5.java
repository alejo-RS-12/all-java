/*Implementar un método que realice un corrimiento a izquierda en
un arreglo ordenado de tamaño MAX=10 a partir de una posición.*/
public class ejercicio8_5 {
	final static int max = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrentero = {1,3,5,7,9,11,13,15,17,19};
		int posicion = 3; //posicion donde se realiza el corrimiento
		
		System.out.println("arreglo original: ");
		imprimir_arreglo(arrentero);
		
		corrimiento_de_izquierda(arrentero, posicion);
		
		System.out.println("arreglo despues del corrimiento de derecha: ");
		imprimir_arreglo(arrentero);
		
	}
	public static void corrimiento_de_izquierda(int [] arr, int posicion){
		for(int i = posicion; i < max - 1; i++){
			arr[i] = arr[i+1];
		}
		arr[max -1] = 0;// el utlim elemento se le asigna un 0
	}
	public static void imprimir_arreglo(int [] arr){
		for (int i = 0; i < max; i++){
			System.out.println(arr[i] +  " ");
		}
		System.out.println();
	}
}

