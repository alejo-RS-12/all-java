/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, invierta el orden del contenido
por fila. Este intercambio no se debe realizar de manera explícita,
hay que hacer un método que incluya una iteración de
intercambio.*/
public class ejercicio1_6 {
	final static int Maxfila = 5;
	final static int Maxcolumna = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrint = {
				{1,2,3,4,5,6,7,8,9,10},
				{11,12,13,14,15,16,17,18,19,20},
				{21,22,23,24,25,26,27,28,29,30},
				{31,32,33,34,35,36,37,38,39,40},
				{41,42,43,44,45,46,47,48,49,50}
		};
		System.out.println("imprimir matriz originla: ");
		imprimir_matriz(matrint);
		
		invertirFilas(matrint);
		
		System.out.println("matriz editada: ");
		imprimir_matriz(matrint);
	}
	public static void invertirFilas(int [][] matrint){
		for(int i= 0; i<Maxfila; i++){
			int inicio = 0;
			int fin = Maxfila-1;
			while(inicio<fin){
				int temp = matrint[i][inicio];
				matrint[i][inicio] = matrint[i][fin];
				matrint[i][fin] = temp;
				inicio++;
				fin--;
			}
		}
	}
	public static void imprimir_matriz(int[][] matrint){
		for(int i = 0; i< Maxfila; i++){
			for(int j = 0; j < Maxcolumna; j++){
				System.out.println(matrint[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
