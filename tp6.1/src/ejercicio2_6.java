/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, obtenga la cantidad de
números pares que tiene y la imprima.*/
public class ejercicio2_6 {
	final static int Maxfilas = 5;
	final static int Maxcolumnas = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrint = {
				{1,2,3,4,5,6,7,8,9,10},
				{11,12,13,14,15,16,17,18,19,20},
				{21,22,23,24,25,26,27,28,29,30},
				{31,32,33,34,35,36,37,38,39,40},
				{41,42,43,44,45,46,47,48,49,50}
		};
		System.out.println("matriz original. ");
		imprimir_matriz(matrint);
		
		int cantidad_pares = contar_numeros(matrint);
		System.out.println("cantidad de nuemeros pares: " + cantidad_pares);

	}
	public static int contar_numeros(int[][] matrint){
		int cantidad = 0;
		for(int i =0; i<Maxfilas; i++){
			for(int j = 0; j<Maxcolumnas; j++){
				if (matrint[i][j] % 2 == 0){
					cantidad++;
				
				}
			}
		}
		return cantidad;
	}
	public static void imprimir_matriz(int[][] matrint){
		for(int i = 0; i<Maxfilas; i++){
			for (int j = 0; j<Maxcolumnas; j++){
				System.out.println(matrint[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
